import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by w on 15-11-4.
 */
public class leapOrNot {
    public static void main(String[] args) {
//        checkLeap();
        checkPositive();
    }

    private static void checkLeap() {
        String year = JOptionPane.showInputDialog(null, "请输入年份", "闰年判断", JOptionPane.INFORMATION_MESSAGE);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(year);
        if (m.find()) {
            int yearInt = Integer.parseInt(year);
            if ((yearInt % 4 == 0 && yearInt % 100 != 0) || yearInt % 400 == 0) {
                JOptionPane.showMessageDialog(null, yearInt + "年是闰年", "闰年判断", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, yearInt + "年不是闰年", "闰年判断", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "该年份无效，请重新输入");
            checkLeap();
        }
    }


    private static void checkPositive() {
        String dd = JOptionPane.showInputDialog(null, "please enter a number: ", "positive check", JOptionPane.INFORMATION_MESSAGE);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(dd);
        if (m.find()) {
            if (Double.parseDouble(dd) > 0) {
                JOptionPane.showMessageDialog(null, dd + " is a positive", "positive check", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, dd + " is not a positive", "positive check", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "该数字无效，请重新输入");
            checkPositive();
        }
    }
}
