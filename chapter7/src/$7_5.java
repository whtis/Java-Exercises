import javax.swing.*;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_5 {
    public static void main(String[] args) {
//        String str = JOptionPane.showInputDialog("please enter a string: ");
        String str = "SSN is 343 32 4545 an ID is 434 34 4323";
        int[] ints = count(str);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                System.out.println(i + " appears " + ints[i] + (ints[i] > 1 ? " times" : " time"));
            }
        }
    }

    private static int[] count(String str) {
        int[] counts = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                counts[c - '0']++;
            }
        }
        return counts;
    }
}
