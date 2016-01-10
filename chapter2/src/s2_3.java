import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_3 {
    public static void main(String[] args) {
        double foot = Double.parseDouble((String) showInPane.Input("请输入英尺数： "));
        double meter = foot * 0.305;
        showInPane.outPut(meter);
    }
}
