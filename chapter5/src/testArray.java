import javax.swing.*;

/**
 * Created by ht on 2015/11/28.
 */
public class testArray {
    public static void main(String[] args) {
        double[] numbers = new double[6];
        double max = 0;
        for (int i = 0; i < 6; i++) {
            numbers[i] = Double.parseDouble(JOptionPane.showInputDialog("请输入一个整数： "));
        }
        System.out.print("the array is ");
        for (double number : numbers) {
            System.out.print(number + " ");
            if (max < number) {
                max = number;
            }
        }
        System.out.println();
        double count = numbers[0];
        for (double number : numbers) {
            if (max == number) {
                count++;
            }
        }
        System.out.println("the max number is " + max);
        System.out.println(max + "'s time is " + count);
    }
}
