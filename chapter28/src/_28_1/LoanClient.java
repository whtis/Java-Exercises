package _28_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

/**
 * Created by ht on 2016/4/12.
 */
public class LoanClient extends JFrame implements ActionListener {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;

    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    private JButton jButton = new JButton("Submit");

    private JTextArea jTextArea;

    private DataInputStream inFromServer = null;
    private DataOutputStream outToServer = null;

    public static void main(String[] args) {
        new LoanClient();
    }

    public LoanClient() throws HeadlessException {

        JPanel labelPanel = new JPanel(new GridLayout(3, 1));
        jLabel1 = new JLabel("Annual Interest Rate ");
        jLabel2 = new JLabel("Number Of Years ");
        jLabel3 = new JLabel("Loan Amount ");
        labelPanel.add(jLabel1);
        labelPanel.add(jLabel2);
        labelPanel.add(jLabel3);

        JPanel textFieldPanel = new JPanel(new GridLayout(3, 1));
        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15);
        jTextField3 = new JTextField(15);
        textFieldPanel.add(jTextField1);
        textFieldPanel.add(jTextField2);
        textFieldPanel.add(jTextField3);


        jButton.addActionListener(this);

        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(labelPanel);
        northPanel.add(textFieldPanel);
        northPanel.add(jButton);

        jTextArea = new JTextArea();

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(northPanel, BorderLayout.NORTH);
        this.getContentPane().add(new JScrollPane(jTextArea), BorderLayout.CENTER);

        this.setTitle("LoanClient");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Socket socket = null;
        try {
            socket = new Socket("Localhost", 8000);
            inFromServer = new DataInputStream(socket.getInputStream());
            outToServer = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jButton) {
            if ((!jTextField1.getText().equals("")) && (!jTextField2.getText().equals("")) && (!jTextField3.getText().equals(""))) {
                double interest = Double.parseDouble(jTextField1.getText());
                double years = Double.parseDouble(jTextField2.getText());
                double amount = Double.parseDouble(jTextField3.getText());
                jTextArea.append("Annual Interest Rate: " + interest + " Number of Years: " + years + " Loan Amount: " + amount + "\n");

                try {
                    outToServer.writeDouble(interest);
                    outToServer.writeDouble(years);
                    outToServer.writeDouble(amount);

                    double monthlyPayment = inFromServer.readDouble();
                    double totalPayment = inFromServer.readDouble();

                    jTextArea.append("monthlyPayment: " + monthlyPayment + "\n");
                    jTextArea.append("totalPayment: " + totalPayment + "\n");

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

    }
}

