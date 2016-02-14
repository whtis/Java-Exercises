package exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/13.
 */
public class $13_5 extends JFrame implements ActionListener {

    private JLabel l1;
    private JLabel l2;

    private JTextField j1;
    private JTextField j2;

    public $13_5() throws HeadlessException {
        l1 = new JLabel("Mile");
        l2 = new JLabel("Kilometer");

        j1 = new JTextField(10);
        j2 = new JTextField(10);

        j1.setHorizontalAlignment(JLabel.RIGHT);
        j2.setHorizontalAlignment(JLabel.RIGHT);

        JPanel p = new JPanel(new GridLayout(2, 2));
        p.add(l1);
        p.add(j1);
        p.add(l2);
        p.add(j2);

        this.getContentPane().add(p);

        j1.addActionListener(this);
        j2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == j1) {
            String str = j1.getText();
            j2.setText(String.valueOf(Double.parseDouble(str) / 0.6241));
        } else if (e.getSource() == j2) {
            String str = j2.getText();
            j1.setText(String.valueOf(Double.parseDouble(str)));
        }
    }

    public static void main(String[] args) {
        $13_5 frame = new $13_5();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
