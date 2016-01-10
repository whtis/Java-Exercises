import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_4 {
    public static void main(String[] args) {
        double b = Double.parseDouble((String) showInPane.Input("请输入磅数： "));
        double kg = b * 0.454;
        showInPane.outPut(kg);
    }
}
