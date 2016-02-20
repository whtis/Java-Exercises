package AddressBook;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Created by ht on 2016/2/19.
 */
public class AddressBookUpdate extends JFrame implements ActionListener {
    final static int NAME_SIZE = 32;
    final static int STREET_SIZE = 32;
    final static int CITY_SIZE = 20;
    final static int STATE_SIZE = 2;
    final static int ZIP_SIZE = 5;
    final static int RECORD_SIZE = (NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE);

    private RandomAccessFile raf;

    private JTextField jtfName = new JTextField(NAME_SIZE);
    private JTextField jtfStreet = new JTextField(STREET_SIZE);
    private JTextField jtfCity = new JTextField(CITY_SIZE);
    private JTextField jtfState = new JTextField(STATE_SIZE);
    private JTextField jtfZip = new JTextField(ZIP_SIZE);

    private JButton jbtAdd = new JButton("Add");
    private JButton jbtFirst = new JButton("First");
    private JButton jbtNext = new JButton("Next");
    private JButton jbtPrevious = new JButton("Previous");
    private JButton jbtLast = new JButton("Last");
    private JButton jbtUpdate = new JButton("Update");

    public AddressBookUpdate() throws HeadlessException {
        try {
            raf = new RandomAccessFile("testFile/AddressBook.w", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
            System.exit(0);
        }

        //放置标签
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1));
        p1.add(new JLabel("Name"));
        p1.add(new JLabel("City"));
        p1.add(new JLabel("Street"));

        //放置state的面板
        JPanel jpState = new JPanel();
        jpState.setLayout(new BorderLayout());
        jpState.add(new JLabel("State"), BorderLayout.WEST);
        jpState.add(jtfState, BorderLayout.CENTER);

        //放置zip的面板
        JPanel jpZip = new JPanel();
        jpZip.setLayout(new BorderLayout());
        jpZip.add(new JLabel("Zip"), BorderLayout.WEST);
        jpZip.add(jtfZip, BorderLayout.CENTER);

        //放置state和zip的面板
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(jpState, BorderLayout.WEST);
        p2.add(jpZip, BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.add(jtfCity, BorderLayout.CENTER);
        p3.add(p2, BorderLayout.EAST);

        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(3, 1));
        p4.add(jtfName);
        p4.add(jtfStreet);
        p4.add(p3);

        JPanel jpAddress = new JPanel();
        jpAddress.setLayout(new BorderLayout());
        jpAddress.add(p1, BorderLayout.WEST);
        jpAddress.add(p4, BorderLayout.CENTER);

        jpAddress.setBorder(new BevelBorder(BevelBorder.RAISED));

        JPanel jpButton = new JPanel();
        jpButton.add(jbtAdd);
        jpButton.add(jbtFirst);
        jpButton.add(jbtNext);
        jpButton.add(jbtPrevious);
        jpButton.add(jbtLast);
        jpButton.add(jbtUpdate);

        this.getContentPane().add(jpAddress, BorderLayout.CENTER);
        this.getContentPane().add(jpButton, BorderLayout.SOUTH);

        jbtAdd.addActionListener(this);
        jbtFirst.addActionListener(this);
        jbtNext.addActionListener(this);
        jbtPrevious.addActionListener(this);
        jbtLast.addActionListener(this);
        jbtUpdate.addActionListener(this);

        try {
            if (raf.length() > 0) {
                readAddress(0);
                System.out.println(raf.getFilePointer());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jbtAdd) {
                writeAddress(raf.length());
            } else if (e.getSource() == jbtFirst) {
                if (raf.length()>0) readAddress(0);
            } else if (e.getSource() == jbtNext) {
                long currentPosition = raf.getFilePointer();
                if (currentPosition < raf.length()) {
                    readAddress(currentPosition);
                }
            } else if (e.getSource() == jbtPrevious) {
                long currentPosition = raf.getFilePointer();
                if (currentPosition > 2 * RECORD_SIZE) {
                    readAddress(currentPosition - 2 * 2 * RECORD_SIZE);
                } else readAddress(0);
            } else if (e.getSource() == jbtLast) {
                long lastPosition = raf.length();
                if (lastPosition > 0) {
                    readAddress((lastPosition - 2 * RECORD_SIZE));
                }
            } else if (e.getSource() == jbtUpdate) {
                long currentPosition = raf.getFilePointer();
                if (currentPosition > 0) {
                    writeAddress(currentPosition - 2 * RECORD_SIZE);
                }
            }
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }

    }

    public void writeAddress(long position) throws IOException {
        raf.seek(position);
        FixedLengthStringIO.writeFixedLengthString(jtfName.getText(), NAME_SIZE, raf);
        FixedLengthStringIO.writeFixedLengthString(jtfStreet.getText(), STREET_SIZE, raf);
        FixedLengthStringIO.writeFixedLengthString(jtfCity.getText(), CITY_SIZE, raf);
        FixedLengthStringIO.writeFixedLengthString(jtfState.getText(), STATE_SIZE, raf);
        FixedLengthStringIO.writeFixedLengthString(jtfZip.getText(), ZIP_SIZE, raf);
    }

    public void readAddress(long position) throws IOException {
        raf.seek(position);
        String name = FixedLengthStringIO.readFixedLengthString(NAME_SIZE, raf);
        String street = FixedLengthStringIO.readFixedLengthString(STREET_SIZE, raf);
        String city = FixedLengthStringIO.readFixedLengthString(CITY_SIZE, raf);
        String state = FixedLengthStringIO.readFixedLengthString(STATE_SIZE, raf);
        String zip = FixedLengthStringIO.readFixedLengthString(ZIP_SIZE, raf);

        jtfName.setText(name);
        jtfStreet.setText(street);
        jtfCity.setText(city);
        jtfState.setText(state);
        jtfZip.setText(zip);
    }

    public static void main(String[] args) {
        AddressBookUpdate frame = new AddressBookUpdate();
        frame.pack();
        frame.setTitle("AddressBook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

