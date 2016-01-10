import javax.swing.*;

/**
 * Created by ht on 2015/12/3.
 */
public class $5_5 {
    public static void main(String[] args) {
        int count = 0;
        boolean b = true;

        double[] doubles = new double[10];
        double d = 1;

        while (d != 0) {
            d = Double.parseDouble(JOptionPane.showInputDialog("请输入一个数：　"));
            for (int i = 0; i <= count; i++) {
                if ( doubles[i]== d) {
                    b = false;
                    break;
                }
            }
            if (b) {
                doubles[count] = d;
                count++;
            }
            if (count > 9) {
                break;
            }
            b = true;
        }

        for (double dd : doubles) {
            System.out.print(dd + " ");
        }
    }
}
