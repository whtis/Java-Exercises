import javax.swing.*;
import java.util.Random;

/**
 * Created by ht on 2015/11/26.
 */
public class $4_11 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("请输入矩阵阶数： "));
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = (char) ('0' + Math.random() * ('1' - '0' + 1));
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
