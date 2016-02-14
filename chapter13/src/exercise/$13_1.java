package exercise;

import zujian.MessagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/12.
 */
public class $13_1 extends JFrame implements ActionListener {

    private JButton b1 = new JButton("<=");
    private JButton b2 = new JButton("=>");

    private MessagePanel messagePanel = new MessagePanel("hello whtis");

    JRadioButton[] rs = new JRadioButton[5];

    public $13_1() throws HeadlessException {
        this.setLayout(new BorderLayout(5, 5));
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(b1);
        p1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel p2 = new JPanel(new GridLayout(1, 0));

        rs[0] = new JRadioButton("Red");
        rs[1] = new JRadioButton("Yellow");
        rs[2] = new JRadioButton("White");
        rs[3] = new JRadioButton("Gray");
        rs[4] = new JRadioButton("Green");

        //设置初始背景色
        rs[0].setSelected(true);
        messagePanel.setBackground(Color.RED);

        ButtonGroup bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            bg.add(rs[i]);
            p2.add(rs[i]);
            rs[i].addActionListener(this);
        }

        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(p2, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            messagePanel.moveLeft();
        } else if (e.getSource() == b2) {
            messagePanel.moveRight();
        } else if (e.getSource() == rs[0]) {
            messagePanel.setBackground(Color.RED);
        } else if (e.getSource() == rs[1]) {
            messagePanel.setBackground(Color.YELLOW);
        } else if (e.getSource() == rs[2]) {
            messagePanel.setBackground(Color.WHITE);
        } else if (e.getSource() == rs[3]) {
            messagePanel.setBackground(Color.GRAY);
        } else if (e.getSource() == rs[4]) {
            messagePanel.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        $13_1 frame = new $13_1();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
