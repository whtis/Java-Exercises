import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/11.
 */
public class Test extends JFrame implements ActionListener {

    JButton button = new JButton("create a new window");

    JFrame aFrame = new JFrame("test");

    public Test() throws HeadlessException {
        this.getContentPane().add(button);

        aFrame.getContentPane().add(new JTextArea());
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.setSize(100, 100);


        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aFrame.setVisible(true);
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.setSize(300,400);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}
