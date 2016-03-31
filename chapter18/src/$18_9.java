import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/**
 * Created by ht on 2016/4/1.
 */
public class $18_9 extends JFrame implements ActionListener {

    private JLabel jLabel;
    private JTextField jTextField;
    private JTextArea jTextArea;
    private JButton jbtSort;
    private JButton jbtShuffle;
    private JButton jbtReverse;

    public $18_9() throws HeadlessException {
        jLabel = new JLabel("Enter a number");
        jTextField = new JTextField(20);
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(jLabel);
        p1.add(jTextField);
        jTextField.addActionListener(this);

        jTextArea = new JTextArea(3, 50);
        JPanel p2 = new JPanel();
        p2.add(jTextArea);

        jbtSort = new JButton("Sort");
        jbtShuffle = new JButton("Shuffle");
        jbtReverse = new JButton("Reverse");
        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(jbtSort);
        p3.add(jbtShuffle);
        p3.add(jbtReverse);
        jbtSort.addActionListener(this);
        jbtShuffle.addActionListener(this);
        jbtReverse.addActionListener(this);

        this.setLayout(new BorderLayout());
        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(p2, BorderLayout.CENTER);
        this.getContentPane().add(p3, BorderLayout.SOUTH);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = jTextArea.getText();
        Set<Integer> set = new HashSet<>();
        String[] nums = str.split(" ");

        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                set.add(Integer.parseInt(nums[i]));
            }
        }

        List<Integer> list = new LinkedList<>(set);

        /**
         * 使用trim方法是为了执行排序后还能在之前基础上追加数据而不报错
         */
        if (e.getSource() == jTextField) {
            String s = jTextField.getText();
            if (s.equals("")) {
                return;
            }
            if (str.equals("")) {
                jTextArea.setText(s);
                jTextField.setText("");
            } else {
                jTextArea.setText(str + " " + s);
                jTextField.setText("");
            }
        } else if (e.getSource() == jbtSort) {
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }
            jTextArea.setText(sb.toString().trim());
        } else if (e.getSource() == jbtShuffle) {
            Collections.shuffle(list);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }
            jTextArea.setText(sb.toString().trim());
        } else if (e.getSource() == jbtReverse) {
            Collections.reverse(list);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }
            jTextArea.setText(sb.toString().trim());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new $18_9();
        frame.setTitle("Exercise9");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
