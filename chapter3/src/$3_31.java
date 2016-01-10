import java.util.Scanner;

/**
 * Created by ht on 2015/11/20.
 */
public class $3_31 {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    private static void method1() {
//        Scanner sca = new Scanner(System.in);
//        System.out.println("请输入范围： ");
//        double num = sca.nextDouble();
        for (double num = 10000; num <= 100000; num += 10000) {
            double exp = 0;
//            for (int i = 0; i <= num; i++) {
//                exp += 1 / computeFactorial(i);
//            }
            for (double i = num; i >= 0; i--) {
                exp += 1 / computeFactorial(i);
            }
            System.out.println(exp);
        }
    }

    private static double computeFactorial(double num) {
        double product = 1;
        for (double i = num; i > 0; i--) {
            product *= i;
        }
        return product;
    }

    private static void method2() {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入范围： ");
        double num = sca.nextDouble();
        double exp = 1;
        double item = 1;
        for (int i = 1; i <= num; i++) {
            item = item / i;
            exp += item;
        }
        System.out.println(exp);
    }
}
