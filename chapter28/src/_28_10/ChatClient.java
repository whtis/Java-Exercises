package _28_10;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

/**
 * Created by ht on 2016/4/20.
 */
public class ChatClient extends JFrame implements KeyListener {

    private JTextArea jtaServer;
    private JTextArea jtaClient;

    private DataInputStream dis;
    private DataOutputStream dos;

    public ChatClient() throws HeadlessException {
        jtaClient = new JTextArea();
        jtaServer = new JTextArea();
        jtaServer.setEditable(false);

        jtaClient.addKeyListener(this);

        JScrollPane jspClient = new JScrollPane(jtaClient);
        JScrollPane jspServer = new JScrollPane(jtaServer);

        jspClient.setBorder(new TitledBorder("Client"));
        jspServer.setBorder(new TitledBorder("Server"));

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(jspServer, BorderLayout.CENTER);
        this.getContentPane().add(jspClient, BorderLayout.SOUTH);

        this.setTitle("ChatClient");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);

        Socket socket = null;
        try {
            socket = new Socket("localhost", 8000);
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());

            while (true) {
                String s = dis.readUTF();
                jtaServer.append("Server: " + s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String s = jtaClient.getText().replaceAll("\n", "");
            jtaServer.append("Client: " + s + "\n");
            jtaClient.setText("");

            try {
                dos.writeUTF(s);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
