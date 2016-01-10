import javax.swing.*;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_3 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("please enter the s1: ");
        String s2 = JOptionPane.showInputDialog("please enter the s2: ");
        boolean b;
        b = checkSubString(s1, s2);
        System.out.println("s1 is s2's subString? " + b);


    }
    //检测s1是否是s2的子串
    private static boolean checkSubString(String s1, String s2) {
        String s2Sub = "";
        char c = s1.charAt(0);
        int index = s2.indexOf(c);
        if (index != (-1) && (index + s1.length()) <= s2.length()) {
            s2Sub = s2.substring(index, (index + s1.length()));
        }
        return s1.equals(s2Sub);
    }
}
