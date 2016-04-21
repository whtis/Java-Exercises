package Test;

import java.io.*;
import java.net.*;

/**
 * Created by ht on 2016/4/16.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8800);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Server started!");

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                oos.writeObject("whtis");
                oos.flush();
                int a = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
