import javax.swing.*;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_7 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("please enter a string: ");
//        String str = "FAA";
        int num = parseHex(str);
        System.out.println(num);
    }

    private static int parseHex(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = 0;
            switch (str.charAt(i)) {
                case 'A':
                    a = 10;
                    break;
                case 'B':
                    a = 11;
                    break;
                case 'C':
                    a = 12;
                    break;
                case 'D':
                    a = 13;
                    break;
                case 'E':
                    a = 14;
                    break;
                case 'F':
                    a = 15;
                    break;
                default:
                    a = Integer.parseInt(Character.toString(str.charAt(i)));
            }
            num += a * Math.pow(16, (str.length() - 1 - i));
        }
        return num;
    }
}
