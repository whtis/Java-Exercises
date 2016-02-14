package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by ht on 2016/2/11.
 */
public class TextFieldDemo extends RadioButtonDemo {
    private JTextField jTextField = new JTextField(20);

    public TextFieldDemo() throws HeadlessException {
        JPanel p = new JPanel(new BorderLayout(5, 0));
        p.add(new JLabel("Enter a new message"), BorderLayout.WEST);
        p.add(jTextField, BorderLayout.EAST);

        this.getContentPane().add(p, BorderLayout.NORTH);

        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (e.getSource() == jTextField) {
            messagePanel.setMessage(jTextField.getText());
            jTextField.requestFocusInWindow();
        }
    }

    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
