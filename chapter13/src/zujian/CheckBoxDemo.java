package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by ht on 2016/2/11.
 */
public class CheckBoxDemo extends ButtonDemo {
    private JCheckBox c1 = new JCheckBox("Centered");
    private JCheckBox c2 = new JCheckBox("Bold");
    private JCheckBox c3 = new JCheckBox("Italic");

    public CheckBoxDemo() throws HeadlessException {
        c1.setMnemonic('C');
        c2.setMnemonic('B');
        c3.setMnemonic('i');

        JPanel p = new JPanel(new GridLayout(3, 0));
        p.add(c1);
        p.add(c2);
        p.add(c3);
        getContentPane().add(p, BorderLayout.EAST);

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == c1) {
            messagePanel.setCentered(c1.isSelected());
        }
        if (e.getSource() == c2 || e.getSource() == c3) {
            int fontStyle = Font.PLAIN;
            fontStyle += (c2.isSelected() ? Font.BOLD : 0);
            fontStyle += (c3.isSelected() ? Font.ITALIC : 0);

            Font font = messagePanel.getFont();
            messagePanel.setFont(new Font(font.getName(), fontStyle, font.getSize()));
        }
    }

    public static void main(String[] args) {
        CheckBoxDemo frame = new CheckBoxDemo();
        frame.setSize(400, 300);
        frame.setLocation(500, 250);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
