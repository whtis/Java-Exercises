import util_chapter2.showInPane;

/**
 * Created by w on 15-11-8.
 */
public class s2_5 {
    public static void main(String[] args) {
        double cost = Double.parseDouble((String) showInPane.Input("请输入费用： "));
        double backRate = Double.parseDouble((String) showInPane.Input("请输入提成： "));
        double backMoney = backRate / 100 * cost;
        double allCost = cost + backMoney;
        showInPane.outPut("backMoney is $" + backMoney + "\n" + "all Cost is $" + allCost);
    }
}
