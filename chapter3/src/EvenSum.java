import javax.swing.*;

/**
 * Created by ht on 2015/11/10.
 */
public class EvenSum {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an even: "));
        int sum = 0;
        while (a != 0) {
            sum += a;
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an even: "));
        }
        JOptionPane.showMessageDialog(null, "the sum is " + sum);
    }
}
