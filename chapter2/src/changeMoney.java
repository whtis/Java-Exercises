import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by w on 15-11-5.
 */
public class changeMoney {
    public static void main(String[] args) {
        showPane();
    }

    private static void showPane() {
        String str = JOptionPane.showInputDialog(null, "please enter a number in double: ", "Money compute", JOptionPane.QUESTION_MESSAGE);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        double remainingMoney;
        if (m.find()) {
            double allMoney = Double.parseDouble(str) * 100;
            int amountY = (int) allMoney / 100;
            remainingMoney = allMoney % 100;
            int amountJ = (int) remainingMoney / 10;
            remainingMoney = remainingMoney % 10;
            int amountF = (int)remainingMoney;
//            JOptionPane.showMessageDialog(null, "amountY is " + amountY + "\n" + "amountJ is " + amountJ + "\n" + "amountF is " + amountF);
            System.out.println("amountY is " + amountY + "\n" + "amountJ is " + amountJ + "\n" + "amountF is " + amountF);
        } else {
            JOptionPane.showMessageDialog(null, "money 输入有误，请重新输入！");
            showPane();
        }
    }
}
