package exercise;

import zujian.MessagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/13.
 */
public class $13_8 extends JFrame implements ActionListener,ItemListener {

    private JLabel l1;
    private JLabel l2;

    private MessagePanel messagePanel;

    private JComboBox cb1;
    private JComboBox cb2;

    private JCheckBox cx1;
    private JCheckBox cx2;
    private JCheckBox cx3;



    public $13_8() throws HeadlessException {

        messagePanel = new MessagePanel("Hello whtis");

        l1 = new JLabel("Font Name");
        l2 = new JLabel("Font Size");

        //get font name
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();
        cb1 = new JComboBox(fontNames);
        //set font size
        String[] sizes = new String[100];
        for (int i = 0; i < 99; i++) {
            sizes[i] = String.valueOf(i + 1);
        }
        cb2 = new JComboBox(sizes);

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        cx1 = new JCheckBox("Centered");
        cx2 = new JCheckBox("Bold");
        cx3 = new JCheckBox("Italic");

        cx1.setMnemonic('C');
        cx2.setMnemonic('B');
        cx3.setMnemonic('I');

        cx1.addActionListener(this);
        cx2.addActionListener(this);
        cx3.addActionListener(this);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(l1);
        p1.add(cb1);
        p1.add(l2);
        p1.add(cb2);
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(cx1);
        p2.add(cx2);
        p2.add(cx3);

        this.setLayout(new BorderLayout(5, 5));
        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(p2, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cx1) {
            messagePanel.setCentered(cx1.isSelected());
        } else if ((e.getSource() == cx2) || (e.getSource() == cx3)) {
            int fontStyle = Font.PLAIN;
            fontStyle += (cx2.isSelected() ? Font.BOLD : 0);
            fontStyle += (cx3.isSelected() ? Font.ITALIC : 0);

            Font font = messagePanel.getFont();
            messagePanel.setFont(new Font(font.getName(), fontStyle, font.getSize()));
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb1) {
            String fontName = (String) cb1.getSelectedItem();
            messagePanel.setFont(new Font(fontName,messagePanel.getFont().getStyle(),messagePanel.getFont().getSize()));
        } else if (e.getSource() == cb2) {
            int size = Integer.parseInt((String)cb2.getSelectedItem());
            messagePanel.setFont(new Font(messagePanel.getFont().getName(), messagePanel.getFont().getStyle(), size));
        }
    }

    public static void main(String[] args) {
        $13_8 frame = new $13_8();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
