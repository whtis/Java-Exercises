import javax.swing.*;

/**
 * Created by ht on 2015/11/16.
 */
public class $3_5 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the year: "));
        boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (b) {
            int month = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the month: "));
            switch (month) {
                case 1:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有29天");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
            }
        } else {
            int month = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the month: "));
            switch (month) {
                case 1:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有28天");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有30天");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, year + " 年" + month + " 月有31天");
                    break;
            }
        }
    }
}
