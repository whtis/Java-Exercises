import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.pow;

/**
 * Created by w on 15-11-4.
 */
public class computeLoan {

    static int year;
    static Double annualInterestRate;
    static Double loanAmount;


    public static void main(String[] args) {
        new computeLoan().showNum("year");
        new computeLoan().showNum("annualInterestRate");
        new computeLoan().showNum("loanAmount");

        double monthInterestRate = annualInterestRate / 1200;
        double monthPay = (loanAmount * monthInterestRate) / (1 - 1 / pow(((1 + monthInterestRate)), year * 12));
        double allPay = monthPay * 12 * year;
        monthPay = (int) (monthPay * 100) / 100.0;
        allPay = (int) (allPay * 100) / 100.0;
        JOptionPane.showMessageDialog(null, "月支付额为 " + monthPay + "\n" + "总支付额为 " + allPay);
    }

    private void showNum(String note) {
        String str = JOptionPane.showInputDialog(null, note, note, JOptionPane.QUESTION_MESSAGE);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        if (m.find()) {
            if (note.equals("year")) {
                year = Integer.parseInt(str);
            } else if (note.equals("annualInterestRate")) {
                annualInterestRate = Double.parseDouble(str);
            } else if (note.equals("loanAmount")) {
                loanAmount = Double.parseDouble(str);
            }
        } else {
            JOptionPane.showMessageDialog(null, note + "输入有误，请重新输入： ");
            showNum(note);
        }
    }
}
