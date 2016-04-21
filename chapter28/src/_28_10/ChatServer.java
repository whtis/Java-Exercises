package _28_10;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Created by ht on 2016/4/20.
 */
public class ChatServer extends JFrame implements KeyListener {

    private JTextArea jtaServer;
    private JTextArea jtaClient;

    private DataInputStream dis;
    private DataOutputStream dos;

    public ChatServer() throws HeadlessException {
        jtaClient = new JTextArea();
        jtaServer = new JTextArea();
        jtaClient.setEditable(false);
        jtaServer.addKeyListener(this);

        JScrollPane jspClient = new JScrollPane(jtaClient);
        JScrollPane jspServer = new JScrollPane(jtaServer);

        jspClient.setBorder(new TitledBorder("Client"));
        jspServer.setBorder(new TitledBorder("Server"));

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(jspClient, BorderLayout.CENTER);
        this.getContentPane().add(jspServer, BorderLayout.SOUTH);

        this.setTitle("ChatServer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);

        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();

            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress.getHostAddress() + " " + inetAddress.getHostName());

            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String s = dis.readUTF();
                jtaClient.append("Client: " + s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ChatServer();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            //JTextFiled回车操作会存在于文本域中，为了保证格式，应该去掉
            String s = jtaServer.getText().replaceAll("\n", "");
            jtaClient.append("Server: " + s + "\n");
            jtaServer.setText("");
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
