package _28_3;

import _28_1.LoanServer;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Date;

/**
 * Created by ht on 2016/4/12.
 */
public class MultiThreadLoanServer extends JFrame {
    private JTextArea jTextArea;

    public static void main(String[] args) {
        new MultiThreadLoanServer();
    }

    public MultiThreadLoanServer() throws HeadlessException {

        jTextArea = new JTextArea();
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(new JScrollPane(jTextArea), BorderLayout.CENTER);

        this.setSize(400, 300);
        this.setTitle("LoanServer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            jTextArea.append("MultiThreadLoanServer started at " + new Date() + "\n");

            int clientNo = 1;

            while (true) {
                Socket socket = serverSocket.accept();
                jTextArea.append("Starting thread for client " + clientNo + " at " + new Date() + "\n");

                InetAddress inetAddress = socket.getInetAddress();
                jTextArea.append("Client's host name is " + inetAddress.getHostName() + "\n");
                jTextArea.append("Client's IP Address is " + inetAddress.getHostAddress() + "\n");

                HandleAClient handleAClient = new HandleAClient(socket);
                handleAClient.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class HandleAClient extends Thread {

        private Socket socket;

        public HandleAClient(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try {
                DataInputStream inFromClient = new DataInputStream(socket.getInputStream());
                DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());

                while (true) {
                    double interest = inFromClient.readDouble();
                    double years = inFromClient.readDouble();
                    double amount = inFromClient.readDouble();
                    jTextArea.append("Annual Interest Rate: " + interest + " Number of Years: " + years + " Loan Amount: " + amount + "\n");

                    double monthlyPayment = amount * interest / (1 - 1 / (Math.pow(1 + interest, years * 12)));
                    double totalPayment = monthlyPayment * 12 * years;

                    outToClient.writeDouble(monthlyPayment);
                    outToClient.writeDouble(totalPayment);

                    jTextArea.append("monthlyPayment: " + monthlyPayment + "\n");
                    jTextArea.append("totalPayment: " + totalPayment + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
