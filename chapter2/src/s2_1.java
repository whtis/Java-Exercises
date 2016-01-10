import util_chapter2.*;

/**
 * Created by w on 15-11-8.
 */
public class s2_1 {
    public static void main(String[] args) {
        showInPane sIP = new showInPane();
        double huaShi = Double.parseDouble((String)sIP.Input("请输入华氏摄氏度"));
        double sheShi = (5.0 / 9) * (huaShi - 32.0);
        sIP.outPut(sheShi);
    }
}
