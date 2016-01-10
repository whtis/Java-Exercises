import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_8 {
    public static void main(String[] args) {
        String string = (String) showInPane.Input("请输入一个ASCII码：");
        int i = Integer.parseInt(string);
        showInPane.outPut((char) i);
    }
}
