package _28_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 * Created by ht on 2016/4/15.
 */
public class AddressClient extends JFrame implements ActionListener {

    private JLabel jllName;
    private JLabel jllStreet;
    private JLabel jllCity;
    private JLabel jllState;
    private JLabel jllZip;

    private JTextField jtfName;
    private JTextField jtfStreet;

    private JTextField jtfCity;

    private JTextField jtfState;
    private JTextField jtfZip;

    private JButton jbtAdd;
    private JButton jbtFirst;
    private JButton jbtNext;
    private JButton jbtPrevious;
    private JButton jbtLast;

    private int current = 0;

    private ArrayList<Object> lists = new ArrayList<>();

    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public AddressClient() throws HeadlessException {

        jllName = new JLabel("Name");
        jllStreet = new JLabel("Street");
        jllCity = new JLabel("City");
        jllState = new JLabel("State");
        jllZip = new JLabel("Zip");

        jtfName = new JTextField(30);
        jtfStreet = new JTextField(30);
        jtfCity = new JTextField(10);
        jtfState = new JTextField(5);
        jtfZip = new JTextField(7);

        jbtAdd = new JButton("Add");
        jbtFirst = new JButton("First");
        jbtNext = new JButton("Next");
        jbtPrevious = new JButton("Previous");
        jbtLast = new JButton("Last");
        jbtAdd.addActionListener(this);
        jbtFirst.addActionListener(this);
        jbtNext.addActionListener(this);
        jbtPrevious.addActionListener(this);
        jbtLast.addActionListener(this);

        JPanel namePanel = new JPanel();
        namePanel.add(jllName);
        namePanel.add(jtfName);

        JPanel streetPanel = new JPanel();
        streetPanel.add(jllStreet);
        streetPanel.add(jtfStreet);

        JPanel cityPanel = new JPanel();
        cityPanel.add(jllCity);
        cityPanel.add(jtfCity);
        cityPanel.add(jllState);
        cityPanel.add(jtfState);
        cityPanel.add(jllZip);
        cityPanel.add(jtfZip);

        JPanel northPanel = new JPanel(new GridLayout(0,1));
        northPanel.add(namePanel);
        northPanel.add(streetPanel);
        northPanel.add(cityPanel);

        JPanel btPanel = new JPanel(new FlowLayout());
        btPanel.add(jbtAdd);
        btPanel.add(jbtFirst);
        btPanel.add(jbtNext);
        btPanel.add(jbtPrevious);
        btPanel.add(jbtLast);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(northPanel, BorderLayout.CENTER);
        this.getContentPane().add(btPanel, BorderLayout.SOUTH);

        this.pack();
        this.setTitle("AddressClient");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 8800);

            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());

            while (true) {
                lists.add(ois.readObject());
            }
        } catch (EOFException e1) {
            showContent(current);
            e1.printStackTrace();
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

    }

    private boolean showContent(int i) {
        Address address = (Address) lists.get(i);
        jtfName.setText(address.getName());
        jtfStreet.setText(address.getStreet());
        jtfCity.setText(address.getCity());
        jtfState.setText(address.getState());
        jtfZip.setText(address.getZip());
        return true;
    }

    public static void main(String[] args) {
        new AddressClient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtAdd) {
            Address address = new Address();
            address.setName(jtfName.getText());
            address.setStreet(jtfStreet.getText());
            address.setCity(jtfCity.getText());
            address.setState(jtfState.getText());
            address.setZip(jtfZip.getText());
            try {
                oos.writeObject(address);
                lists.add(address);
                current = lists.size() - 1;
                showContent(current);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == jbtFirst) {
            current = 0;
            showContent(current);
        } else if (e.getSource() == jbtNext) {
            if (lists.size() > (current+1)) {
                current += 1;
            }
            showContent(current);
        } else if (e.getSource() == jbtPrevious) {
            if (current > 0) {
                current -= 1;
            }
            showContent(current);
        } else if (e.getSource() == jbtLast) {
            current = lists.size() - 1;
            showContent(current);
        }
    }
}
