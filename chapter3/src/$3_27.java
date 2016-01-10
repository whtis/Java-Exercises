import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ht on 2015/11/20.
 */
public class $3_27 {
    public static void main(String[] args) {

        double interest = 0;
        double principal = 0; //本金
        double allMoneyAmount = 0;

        Scanner sca = new Scanner(System.in);
        System.out.println("请输入贷款总额： ");
        double loadMoney = sca.nextDouble();
        System.out.println("请输入贷款年限 ： ");
        int year = sca.nextInt();
        System.out.println("请输入贷款年利率 ： ");
        double yearRate = sca.nextDouble();

        allMoneyAmount += loadMoney;

        //compute the month's amount
        double monthAmount = (loadMoney * yearRate / 1200) / (1 - 1 / Math.pow(1 + yearRate / 1200, year * 12));
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("贷款总额： " + loadMoney);
        System.out.println("年数： " + year);
        System.out.println("年利率： " + yearRate + "%");
        System.out.println("月支付额： " + df.format(monthAmount));

        System.out.println("月份#\t\t" + "利息\t\t" + "本金\t\t" + "余额");
        for (int i = 1; i <= year * 12; i++) {
            interest = loadMoney * yearRate / 1200;
            allMoneyAmount += interest;
            principal = monthAmount - interest;
            loadMoney = loadMoney - principal;
            System.out.println(i+"\t\t\t" + df.format(interest)+"\t\t" + df.format(principal)+"\t\t" + df.format(loadMoney));
        }
        System.out.println("总偿还额： " + df.format(allMoneyAmount));
    }
}
