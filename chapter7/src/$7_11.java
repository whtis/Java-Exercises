import javax.swing.*;
import java.util.Arrays;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_11 {
    public static void main(String[] args) {
//        String str = JOptionPane.showInputDialog("please enter a string: ");
        String str = "odfji34ji9dq89jviojsei9";
        String newStr = sort(str);
        System.out.println(newStr);
    }

    private static String sort(String str) {
        //转变成单一字符
        char[] chars = str.toCharArray();
        //对字符排序
//        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j > i; j--) {
                if (chars[i] > chars[j]) {
                    char c = chars[i];
                    chars[i] = chars[j];
                    chars[j] = c;
                }
            }
        }
        return String.copyValueOf(chars);
    }
}
