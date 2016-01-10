import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_9 {
    public static void main(String[] args) {
        int a = Integer.parseInt((String) showInPane.Input("请输入三角形的第一条边："));
        int b = Integer.parseInt((String) showInPane.Input("请输入三角形的第二条边："));
        int c = Integer.parseInt((String) showInPane.Input("请输入三角形的第三条边："));
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        boolean b1 = (a + b > c);
        showInPane.outPut("can edges " + a + " ," + b + " ," + " and " + c + " form a triagle? " + b1);

    }
}
