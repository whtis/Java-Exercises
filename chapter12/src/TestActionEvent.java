import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 * Created by ht on 2016/2/8.
 */
public class TestActionEvent extends JFrame {
    public TestActionEvent() throws HeadlessException {
        JButton b1 = new JButton("ok");
        JButton b2 = new JButton("cancel");
        this.setLayout(new FlowLayout());
        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        btListener btListener = new btListener();
        b1.addActionListener(btListener);
        b2.addActionListener(btListener);
        btListener btListener1 = new btListener();
        b1.addActionListener(btListener1);
        b2.addActionListener(btListener1);

    }

    public static void main(String[] args) {
        TestActionEvent testActionEvent = new TestActionEvent();
        testActionEvent.setTitle("testActionEvent");
        testActionEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testActionEvent.setSize(400, 300);
        testActionEvent.setVisible(true);
    }
}

class btListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("the " + e.getActionCommand() + " button is created at \n" +
                new Date(e.getWhen()));
    }
}