package Test;

import java.io.*;
import java.net.Socket;

/**
 * Created by ht on 2016/4/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8800);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String s = (String) ois.readObject();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
