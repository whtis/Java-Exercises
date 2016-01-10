import java.util.Scanner;

/**
 * Created by ht on 2015/11/27.
 */
public class $4_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int m = scanner.nextInt();
        System.out.println("请输入另一个整数： ");
        int n = scanner.nextInt();
        computeGcd(m, n);
    }

    private static void computeGcd(int m, int n) {
        if (m % n == 0) {
            System.out.println("最大公约数是： " + n);
        } else {
            computeGcd(n, m % n);
        }
    }
}
