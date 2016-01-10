import javax.swing.*;

/**
 * Created by w on 15-11-9.
 */
public class ComputeTaxWithSelectionStatement {
    public static void main(String[] args) {
        String statusString = JOptionPane.showInputDialog(null, "Enter the filling status:\n" + "(0-single filter, 1-married,\n" +
                "2-married separately, 3-head of household");
        int status = Integer.parseInt(statusString);
        String incomeString = JOptionPane.showInputDialog(null, "Enter the taxable income: ", JOptionPane.QUESTION_MESSAGE);
        double income = Double.parseDouble(incomeString);
        double tax = 0;
        if (status == 0) {
            if (income <= 6000) {
                tax = income * 0.10;
            }
            if (income >= 6001 && income <= 27950) {
                tax = 6000 * 0.10 + (income - 6000) * 0.15;
            }
            if (income >= 27951 && income <= 67700) {
                tax = 6000 * 0.10 + (27950-6000) * 0.15 + (income - 27950) * 0.27;
            }
            if (income >= 67701 && income <= 141250) {
                tax = 6000 * 0.10 + (27950-6000) * 0.15 + (67700 - 27950) * 0.27 + (income - 677700) * 0.30;
            }
            if (income >= 141251 && income <= 307050) {
                tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 + (income - 141250) * 0.35;
            }
            if (income >= 307051) {
                tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 + (307050 - 141250) * 0.35 + (income - 307050) * 0.386;
            }
        } else  if (status == 1) {
            if (income <= 12000) {
                tax = income * 0.10;
            }
            if (income >= 12001 && income <= 46700) {
                tax = 12000 * 0.10 + (income - 12000) * 0.15;
            }
            if (income >= 46701 && income <= 112850) {
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (income - 46700) * 0.27;
            }
            if (income >= 112851 && income <= 171950) {
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (income - 112850) * 0.30;
            }
            if (income >= 171951 && income <= 307050) {
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (171950 - 112850) * 0.30 + (income - 171950) * 0.35;
            }
            if (income >= 3070501) {
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (171950 - 112850) * 0.30 + (307050 - 171950) * 0.35 + (income - 307050) * 0.386;
            }
        } else if (status == 2) {
            if (income <= 6000) {
                tax = income * 0.10;
            }
            if (income >= 6001 && income <= 23350) {
                tax = 6000 * 0.10 + (income - 6000) * 0.15;
            }
            if (income >= 23351 && income <= 56425) {
                tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (income - 23350) * 0.27;
            }
            if (income >= 56426 && income <= 85975) {
                tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (income - 56425) * 0.30;
            }
            if (income >= 85976 && income <= 153525) {
                tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (85975 - 56425) * 0.30 + (income - 85975) * 0.35;
            }
            if (income >= 3070501) {
                tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (85975 - 56425) * 0.30 + (153525 - 85975) * 0.35 + (income - 153525) * 0.386;
            }
        } else if (status == 3) {
            if (income <= 10000) {
                tax = income * 0.10;
            }
            if (income >= 10001 && income <= 37450) {
                tax = 10000 * 0.10 + (income - 10000) * 0.15;
            }
            if (income >= 37451 && income <= 96700) {
                tax = 10000 * 0.10 + (37450 - 10000) * 0.15 + (income - 37450) * 0.27;
            }
            if (income >= 96701 && income <= 156600) {
                tax = 10000 * 0.10 + (37450 - 10000) * 0.15 + (96700 - 37451) * 0.27 + (income - 96700) * 0.30;
            }
            if (income >= 156601 && income <= 307050) {
                tax = 10000 * 0.10 + (37450 - 10000) * 0.15 + (96700 - 37451) * 0.27 + (156600 - 96700) * 0.30 + (income - 156600) * 0.35;
            }
            if (income >= 3070501) {
                tax = 10000 * 0.10 + (37450 - 10000) * 0.15 + (96700 - 37451) * 0.27 + (156600 - 96700) * 0.30 + (307050 - 156600) * 0.35 + (income - 307050) * 0.386;
            }
        } else {
            System.out.println("Error: invalid status");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Tax is $" + (int) (tax * 100) / 100.0, "", JOptionPane.INFORMATION_MESSAGE);
    }
}
