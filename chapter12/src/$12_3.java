import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_3 extends JFrame implements ActionListener {

    private JButton ok = new JButton("ok");
    private JButton cancel = new JButton("cancel");
    private MessagePanel messagePanel = new MessagePanel();

    public $12_3() throws HeadlessException {
        this.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.add(ok);
        p1.add(cancel);
        this.getContentPane().add(p1, BorderLayout.SOUTH);
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        ok.addActionListener(this);
        cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        messagePanel.setMessage(e.getActionCommand() + " is clicked");
        messagePanel.setCentered(true);
        repaint();
    }

    public static void main(String[] args) {
        $12_3 frame = new $12_3();
        frame.setTitle("Exercise 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);

    }
}
