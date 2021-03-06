import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/5.
 */
public class TestMessagePane extends JFrame {
    public TestMessagePane() throws HeadlessException {
        MessagePanel m1 = new MessagePanel("Welcome to Java");
        MessagePanel m2 = new MessagePanel("Java is fun");
        MessagePanel m3 = new MessagePanel("Java is cool");
        MessagePanel m4 = new MessagePanel("I love Java");
        m1.setFont(new Font("SanSerif", Font.ITALIC, 20));
        m2.setFont(new Font("Courier", Font.BOLD, 20));
        m3.setFont(new Font("Times", Font.ITALIC, 20));
        m4.setFont(new Font("Californian FB", Font.PLAIN, 20));

        m1.setBackground(Color.black);
        m2.setBackground(Color.CYAN);
        m3.setBackground(Color.green);
        m4.setBackground(Color.white);
        m1.setCentered(true);

        this.getContentPane().setLayout(new GridLayout(2, 2));
        this.getContentPane().add(m1);
        this.getContentPane().add(m2);
        this.getContentPane().add(m3);
        this.getContentPane().add(m4);
    }

    public static void main(String[] args) {
        TestMessagePane testMessagePane = new TestMessagePane();
        testMessagePane.setSize(300, 200);
        testMessagePane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testMessagePane.setVisible(true);

    }
}
