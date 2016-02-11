import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/11.
 */
public class Test extends JFrame {
    MessagePanel messagePanel = new MessagePanel("hello");

    public Test() throws HeadlessException {
        messagePanel.setBackground(Color.black);

        this.getContentPane().add(messagePanel);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.pack();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}
