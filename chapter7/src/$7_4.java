import javax.swing.*;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_4 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("please enter a string: ");
        String s = JOptionPane.showInputDialog("please enter the char: ");
        char c = s.charAt(0);
        int a = count(str, c);
        System.out.println(s + " appears " + a + (a > 1 ? " times" : " time"));
    }

    private static int count(String str, char c) {
        int count = 0;
        int index;
        while (str.length() != 0) {
            index = str.indexOf(c);
            if (index != (-1)) {
                str = str.substring(index + 1, str.length());
                count++;
            } else break;
        }
        return count;
    }
}
