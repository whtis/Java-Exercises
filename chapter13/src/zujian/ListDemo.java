package zujian;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/12.
 */
public class ListDemo extends JFrame implements ListSelectionListener {

    final int NUMBER_OF_PERSON = 4;

    private String[] names = {"fanbing", "libing", "zhangziyi", "zhaowei"};

    private JList jList = new JList(names);

    private ImageIcon[] icons = {
            new ImageIcon("image/fanbing.png"),
            new ImageIcon("image/libing.png"),
            new ImageIcon("image/zhangziyi.png"),
            new ImageIcon("image/zhaowei.png")
    };

    private JLabel[] jLabels = new JLabel[NUMBER_OF_PERSON];

    public ListDemo() throws HeadlessException {
        JPanel p = new JPanel(new GridLayout(2, 2, 4, 4));
        for (int i = 0; i < NUMBER_OF_PERSON; i++) {
            p.add(jLabels[i] = new JLabel());
            jLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
        }

        this.getContentPane().add(p, BorderLayout.CENTER);
        this.getContentPane().add(new JScrollPane(jList), BorderLayout.WEST);

        jList.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int[] indices = jList.getSelectedIndices();

        int i;

        for (i = 0; i < indices.length; i++) {
            jLabels[i].setIcon(icons[indices[i]]);
        }

        for (; i < NUMBER_OF_PERSON; i++) {
            jLabels[i].setIcon(null);
        }
    }

    public static void main(String[] args) {
        ListDemo frame = new ListDemo();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
