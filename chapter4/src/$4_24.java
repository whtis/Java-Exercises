import java.util.Scanner;

/**
 * Created by ht on 2015/11/27.
 */
public class $4_24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int a = s.nextInt();
        int sum = 0;
        computeSum(a, sum);
    }

    private static void computeSum(int a, int sum) {
        if (a / 10 < 1) {
            sum += a;
            System.out.println("各个数字之和为 " + sum);
        } else {
            sum += a % 10;
            a = a / 10;
            computeSum(a, sum);
        }

    }
}
