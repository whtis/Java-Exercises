import javax.swing.*;

/**
 * Created by ht on 2015/11/17.
 */
public class $3_6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter an even: "));
        int i = 0;
        int sum = 0;
        int average = 0;
        while (a != 0) {
            sum += a;
            i++;
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter an even: "));
        }
        double b = sum / i;
        JOptionPane.showMessageDialog(null, "sum is " + sum + ", average is " + b);
    }
}
