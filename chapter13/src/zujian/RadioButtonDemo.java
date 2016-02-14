package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by ht on 2016/2/11.
 */
public class RadioButtonDemo extends CheckBoxDemo {
    private JRadioButton j1 = new JRadioButton("Red");
    private JRadioButton j2 = new JRadioButton("Green");
    private JRadioButton j3 = new JRadioButton("Blue");

    public RadioButtonDemo() throws HeadlessException {

        j1.setMnemonic('R');
        j2.setMnemonic('G');
        j3.setMnemonic('U');

        JPanel p = new JPanel(new GridLayout(3, 0));
        p.add(j1);
        p.add(j2);
        p.add(j3);
        this.getContentPane().add(p, BorderLayout.WEST);

        ButtonGroup group = new ButtonGroup();
        group.add(j1);
        group.add(j2);
        group.add(j3);

        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);

        j3.setSelected(true);
        messagePanel.setForeground(Color.blue);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == j2) {
            messagePanel.setForeground(Color.GREEN);
        } else if (e.getSource() == j1) {
            messagePanel.setForeground(Color.RED);
        } else if (e.getSource() == j3) {
            messagePanel.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setSize(400, 300);
        frame.setLocation(500, 250);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
