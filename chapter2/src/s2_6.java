import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_6 {
    public static void main(String[] args) {
        int sum = 0;
        String number = (String) showInPane.Input("请输入一个整数： ");
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            String str = String.valueOf(c);
            sum += Integer.parseInt(str);
        }
        showInPane.prt(sum);
    }
}
