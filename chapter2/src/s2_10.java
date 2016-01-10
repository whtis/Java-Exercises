import javax.swing.*;

/**
 * Created by w on 15-11-8.
 */
public class s2_10 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入一个整数： "));
        boolean b = (num % 2 == 0);
        JOptionPane.showMessageDialog(null, "Is " + num + " an even number? " + b);
    }
}
