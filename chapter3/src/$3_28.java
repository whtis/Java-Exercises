import java.util.Scanner;

/**
 * Created by ht on 2015/11/20.
 */
public class $3_28 {
    public static void main(String[] args) {
        //cancellation error
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入n的值： ");
        int n = sca.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        System.out.println("n 从小到大的值为： " + sum);
        double sum1 = 0;
        for (double i = n; i > 0; i--) {
            sum1 += 1 / i;
        }
        System.out.println("n 从大到小的值为： " + sum1);
    }
}
