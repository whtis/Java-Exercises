package _28_6;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Created by ht on 2016/4/15.
 */
public class AddressServer extends JFrame {

    private JTextArea jTextArea;

    private static final int MAX_THREAD = 2;

    public AddressServer() throws HeadlessException {

        jTextArea = new JTextArea();
        this.getContentPane().add(new JScrollPane(jTextArea));

        this.setSize(500, 400);
        this.setTitle("AddressServer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        try {
            ServerSocket serverSocket = new ServerSocket(8800);
            jTextArea.append("AddressServer started!\n");

            ThreadGroup g = new ThreadGroup("Serving clients");

            while (true) {

                if (g.activeCount() > MAX_THREAD) {
                    Thread.sleep(1000);
                } else {
                    Socket socket = serverSocket.accept();
                    InetAddress inetAddress = socket.getInetAddress();
                    jTextArea.append("A new client is connected! \n");
                    jTextArea.append("address is " + inetAddress.getHostName() + "\n");
                    jTextArea.append("address IP is " + inetAddress.getHostAddress() + "\n");

                    Thread thread = new Thread(g, new AddThread(socket));
                    thread.start();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new AddressServer();
    }

    class AddThread extends Thread {

        private Socket socket;
        private ArrayList<Object> lists = new ArrayList<>();

        public AddThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            ObjectInputStream ois = null;
            ObjectOutputStream oos = null;

            readFile(lists);
            try {
                oos = new ObjectOutputStream(socket.getOutputStream());
                ois = new ObjectInputStream(socket.getInputStream());

                ObjectOutputStream outToFile = new ObjectOutputStream(new FileOutputStream("Address.dat", true));
                while (true) {
                    if (lists.size() > 0) {
                        for (int i = 0; i < lists.size(); i++) {
                            oos.writeObject(lists.get(i));
                        }
                    }

                    Object o = ois.readObject();

                    outToFile.writeObject(o);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void readFile(ArrayList<Object> lists) {
        try {
            File file = new File("Address.dat");
            if (!file.exists()) {
                return;
            }
            ObjectInputStream InFromFile = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                lists.add(InFromFile.readObject());
            }
        } catch (EOFException e) {
            e.printStackTrace();
            jTextArea.append("Data read completed!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
