import javax.swing.*;

/**
 * Created by ht on 2015/11/11.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an even: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an even: "));
        int gcd = 1;
        int k = 1;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        JOptionPane.showMessageDialog(null, "the greatest CommonDivisor is " + gcd);
    }
}
