import javax.swing.*;
import java.text.DecimalFormat;
/**
 * Created by w on 15-11-8.
 */

public class s2_12 {
    public static void main(String[] args) {
        double money = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount of money:"));
        double rate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the rate: "));
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the years: "));
        double finalMoney = money * Math.pow(1 + rate / 1200, year * 12);
        JOptionPane.showMessageDialog(null, finalMoney);
        finalMoney = ((int) (finalMoney * 100)) / 100.00;
        JOptionPane.showMessageDialog(null, finalMoney);
    }
}
