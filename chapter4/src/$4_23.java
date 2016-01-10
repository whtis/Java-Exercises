import javax.swing.*;

/**
 * Created by ht on 2015/11/27.
 */
public class $4_23 {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("enter the message: ");
        int times = Integer.parseInt(JOptionPane.showInputDialog("enter the times: "));
        displayMessage(string, times);
    }

    private static void displayMessage(String string, int times) {
        if (times == 0) {
            System.out.println(string);
            System.exit(0);
        } else {
            System.out.println(string);
            int num = times - 1;
            displayMessage(string, num);
        }
    }
}
