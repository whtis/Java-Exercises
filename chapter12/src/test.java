import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class test extends JFrame {
    public test() {
        JButton ok = new JButton("ok");
        this.getContentPane().add(ok);
        this.getContentPane().add(new JOptionPane("hello"), BorderLayout.NORTH);
        returnWidth();
    }

    private void returnWidth() {
        System.out.println(this.getWidth());
    }


    public static void main(String[] args) {
        test test = new test();
        test.setSize(400, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
