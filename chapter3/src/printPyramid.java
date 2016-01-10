import javax.swing.*;

/**
 * Created by ht on 2015/11/11.
 */
public class printPyramid {
    public static void main(String[] args) {
        int numlines = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the number of lines: "));
        for (int row = 1; row <= numlines; row++) {
            for (int column = 0; column < numlines - row; column++) {
                System.out.print("   ");
            }
            for (int i = row; i > 0; i--) {
                System.out.print((i >= 10) ? " " + i : "  " + i);
            }
            for (int j = 2; j <= row; j++) {
                System.out.print((j >= 10) ? " " + j : "  " + j);
            }
            System.out.println();
        }
    }
}
