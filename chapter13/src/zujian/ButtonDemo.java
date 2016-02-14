package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/11.
 */
public class ButtonDemo extends JFrame implements ActionListener{

    protected MessagePanel messagePanel = new MessagePanel("hello whtis");


    private JButton b1 = new JButton("<=");
    private JButton b2 = new JButton("=>");

    public ButtonDemo() throws HeadlessException {
        b1.addActionListener(this);
        b2.addActionListener(this);

        b1.setMnemonic('L');
        b2.setMnemonic('R');

        b1.setToolTipText("move to left");
        b2.setToolTipText("move to right");

        JPanel p = new JPanel(new GridLayout(0, 2));
        p.add(b1);
        p.add(b2);

        this.setLayout(new BorderLayout());
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(p, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            messagePanel.moveLeft();
        }
        if (e.getSource() == b2) {
            messagePanel.moveRight();
        }
    }

    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setSize(400, 300);
        frame.setLocation(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
