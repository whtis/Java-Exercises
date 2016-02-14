package exercise;

import zujian.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/13.
 */
public class $13_10 extends JFrame implements ActionListener,ItemListener {

    private JButton bu1;
    private JButton bu2;

    private JCheckBox jcbx1;
    private JCheckBox jcbx2;
    private JCheckBox jcbx3;

    private JRadioButton jrb1;
    private JRadioButton jrb2;
    private JRadioButton jrb3;

    private MessagePanel messagePanel;

    private JLabel jbl1;
    private JLabel jbl2;

    private JTextField jtf;

    private JComboBox jcb;

    public static void main(String[] args) {
        $13_10 frame = new $13_10();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public $13_10() throws HeadlessException {
        JPanel nPanel = new JPanel(new FlowLayout());
        JPanel sPanel = new JPanel(new FlowLayout());

        messagePanel = new MessagePanel("hello whtis");

        ButtonGroup bg = new ButtonGroup();
        jrb1 = new JRadioButton("Red");
        jrb2 = new JRadioButton("Green");
        jrb3 = new JRadioButton("Blue");
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        jrb1.addActionListener(this);
        jrb2.addActionListener(this);
        jrb3.addActionListener(this);
        jrb1.setSelected(true);
        messagePanel.setForeground(Color.RED);

        jcbx1 = new JCheckBox("Centered");
        jcbx2 = new JCheckBox("Bold");
        jcbx3 = new JCheckBox("Italic");
        jcbx1.addActionListener(this);
        jcbx2.addActionListener(this);
        jcbx3.addActionListener(this);

        bu1 = new JButton("<=");
        bu2 = new JButton("=>");
        bu1.addActionListener(this);
        bu2.addActionListener(this);

        jbl1 = new JLabel("Enter a new message");
        jbl2 = new JLabel("Select an interval");

        jtf = new JTextField(6);
        jtf.addActionListener(this);

        String[] intervals = new String[20];
        for (int i = 1; i <= 20; i++) {
            intervals[i - 1] = String.valueOf(i * 5);
        }
        jcb = new JComboBox(intervals);
        jcb.setSelectedIndex(1);
        jcb.addItemListener(this);

        nPanel.setBorder(new TitledBorder("North Panel"));
        nPanel.add(jrb1);
        nPanel.add(jrb2);
        nPanel.add(jrb3);
        nPanel.add(jcbx1);
        nPanel.add(jcbx2);
        nPanel.add(jcbx3);

        messagePanel.setBorder(new TitledBorder("Message Panel"));
        messagePanel.setxCoordinate(50);
        messagePanel.setyCoordinate(30);

        sPanel.setBorder(new TitledBorder("South Panel"));
        sPanel.add(bu1);
        sPanel.add(bu2);
        sPanel.add(jbl1);
        sPanel.add(jtf);
        sPanel.add(jbl2);
        sPanel.add(jcb);

        this.setLayout(new BorderLayout(5, 5));
        this.getContentPane().add(nPanel, BorderLayout.NORTH);
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(sPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bu1) {
            messagePanel.moveLeft();
        } else if (e.getSource() == bu2) {
            messagePanel.moveRight();
        } else if (e.getSource() == jrb1) {
            messagePanel.setForeground(Color.RED);
        } else if (e.getSource() == jrb2) {
            messagePanel.setForeground(Color.GREEN);
        } else if (e.getSource() == jrb3) {
            messagePanel.setForeground(Color.BLUE);
        } else if (e.getSource() == jcbx1) {
            messagePanel.setCentered(jcbx1.isSelected());
        } else if ((e.getSource() == jcbx2) || (e.getSource() == jcbx3)) {
            int fontStyle = Font.PLAIN;
            fontStyle += (jcbx2.isSelected() ? Font.BOLD : 0);
            fontStyle += (jcbx3.isSelected() ? Font.ITALIC : 0);
            messagePanel.setFont(new Font(messagePanel.getFont().getName(),fontStyle,messagePanel.getFont().getSize()));
        } else if (e.getSource() == jtf) {
            messagePanel.setMessage(jtf.getText());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == jcb) {
            messagePanel.setInterval(Integer.parseInt((String) jcb.getSelectedItem()));
        }
    }
}
