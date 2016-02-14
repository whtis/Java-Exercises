package exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/13.
 */
public class $13_4 extends JFrame implements ActionListener {

    private JLabel number1;
    private JLabel number2;
    private JLabel result;

    private JTextField n1;
    private JTextField n2;
    private JTextField n3;

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    public $13_4() throws HeadlessException {
        number1 = new JLabel("Number 1");
        number2 = new JLabel("Number 2");
        result = new JLabel("Result");

        n1 = new JTextField(5);
        n2 = new JTextField(5);
        n3 = new JTextField(10);

        n1.setHorizontalAlignment(JTextField.LEFT);
        n2.setHorizontalAlignment(JTextField.LEFT);
        n3.setHorizontalAlignment(JTextField.RIGHT);
        n3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

        b1.setMnemonic('A');
        b2.setMnemonic('S');
        b3.setMnemonic('M');
        b4.setMnemonic('D');

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(number1);
        p1.add(n1);
        p1.add(number2);
        p1.add(n2);
        p1.add(result);
        p1.add(n3);

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        this.setLayout(new BorderLayout(5, 5));
        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(p2, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = n1.getText();
        String s2 = n2.getText();
        if (!s1.equals("")&&!s2.equals("")) {
            if (e.getSource() == b1) {
                n3.setText(String.valueOf(Double.parseDouble(s1) + Double.parseDouble(s2)));
            } else if (e.getSource() == b2) {
                n3.setText(String.valueOf(Double.parseDouble(s1) - Double.parseDouble(s2)));
            } else if (e.getSource() == b3) {
                n3.setText(String.valueOf(Double.parseDouble(s1) * Double.parseDouble(s2)));
            } else if (e.getSource() == b4) {
                if (!s2.equals("0")) {
                    n3.setText(String.valueOf(Double.parseDouble(s1) / Double.parseDouble(s2)));
                }
            }
        }
    }

    public static void main(String[] args) {
        $13_4 frame = new $13_4();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
