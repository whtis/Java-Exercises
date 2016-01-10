import javax.swing.*;

/**
 * Created by w on 15-11-8.
 */
public class s2_11 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter a even: "));
        boolean b1 = (num % 5 == 0) && (num % 6 == 0);
        boolean b2 = (num % 5 == 0) || (num % 6 == 0);
        boolean b3 = ((num % 5 == 0) || (num % 6 == 0)) && (!b1);
        JOptionPane.showMessageDialog(null, "Is " + num + " divisible by 5 and 6? " + b1 + "\n" + "Is " + num
                + " divisible by 5 or 6? " + b2 + "\n" + "Is " + num + " divisible by 5 and 6, but not both? " + b3);
    }
}
