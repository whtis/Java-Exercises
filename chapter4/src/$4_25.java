/**
 * Created by ht on 2015/11/27.
 */
public class $4_25 {
    public static void main(String[] args) {
        double sum = 0;
        int index = 20;
        method1(index, sum);
        method2(index, sum);
    }

    private static void method1(int index, double sum) {
        for (double i = 1; i <= index; i++) {
            sum += i / (i + 1);
            System.out.println(i + "\t" + sum);
        }

    }

    private static void method2(double index, double sum) {
        if (index == 1) {
            sum += 1.0 / 2.0;
            System.out.println(sum);
        } else {
            sum += index / (index + 1);
            index--;
            method2(index, sum);
        }
    }
}
