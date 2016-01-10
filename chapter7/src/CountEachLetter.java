import javax.swing.*;

/**
 * Created by ht on 2015/12/13.
 */
public class CountEachLetter {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("please enter a String: ");
        str = str.toLowerCase();
        String output = "";

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                output += (char) ('a' + i) + " appears " + count[i] + ((count[i] == 1) ? " time" : " times") + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
