package exercise;

import zujian.MessagePanel;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/13.
 */
public class $13_14 extends JFrame implements ItemListener, ListSelectionListener {

    private JLabel lb;

    private JComboBox cb;

    private JList lt;

    private MessagePanel messagePanel;

    //    private String[] names = {"fanbing", "libing", "zhangziyi", "zhaowei"};
    private String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"};

    public static void main(String[] args) {
        $13_14 frame = new $13_14();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public $13_14() throws HeadlessException {

        String[] selectItems = {"SINGLE_SELECTION", "SINGLE_INTERVAL_SETECTION", "MULTIPLE_INTERVAL_SELECTION"};

        cb = new JComboBox(selectItems);
        lt = new JList(names);
        lb = new JLabel("Choose Selection Mode");
        JScrollPane scrollPane = new JScrollPane(lt);

        cb.setSelectedIndex(2);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(lb);
        p1.add(cb);

        messagePanel = new MessagePanel("hello whtis");

        cb.addItemListener(this);
        lt.addListSelectionListener(this);

        this.setLayout(new BorderLayout(5, 5));
        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        this.getContentPane().add(messagePanel, BorderLayout.SOUTH);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) {
            if (cb.getSelectedIndex() == 0) {
                lt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            } else if (cb.getSelectedIndex() == 1) {
                lt.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            } else if (cb.getSelectedIndex() == 2) {
                lt.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int[] indices = lt.getSelectedIndices();
        int i;
        StringBuffer stringBuffer = new StringBuffer(32);
        for (i = 0; i < indices.length; i++) {
            stringBuffer.append(" " + names[i]);
        }
        messagePanel.setMessage(stringBuffer.toString());
    }
}
