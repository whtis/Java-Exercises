import javax.swing.*;

/**
 * Created by ht on 2015/12/13.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("please enter a string:");
        String output;
        boolean b = isPalindrome(str);
        output = str + "is palindrome? " + b;
        JOptionPane.showMessageDialog(null, output);
    }

    private static boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
