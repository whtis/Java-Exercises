import javax.swing.*;

/**
 * Created by ht on 2015/11/25.
 */
public class $4_10 {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "enter an even: "));
//        JOptionPane.showMessageDialog(null, isPrime(m));
        isPrime(m);
    }

    private static boolean isPrime(int m) {
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        int count = 0;
        boolean b = true;
        for (int i = 0; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.printf("%4s", i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            b = true;
        }
        return true;
    }
}
