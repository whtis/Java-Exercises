import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_7 {
    public static void main(String[] args) {
        String str = (String) showInPane.Input("请输入一个大写字母： ");
        char c = str.charAt(0);
        int offset = (int) 'a' - (int) 'A';
        int upperCaseC = (int) c + offset;
        showInPane.outPut((char) upperCaseC);
    }
}
