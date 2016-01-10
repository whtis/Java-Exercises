import java.util.Scanner;

/**
 * Created by ht on 2015/11/20.
 */
public class $3_30 {
    public static void main(String[] args) {
        //compute the pi
//        Scanner sca = new Scanner(System.in);
//        System.out.println("请输入近似范围： ");
//        double range = sca.nextDouble();
        for (int j = 10000; j <= 10000000; j += 10000) {
            double sum = 0;
            double i = 0;
            while (i <= j) {
                sum += (1 / (2 * i + 1)) * Math.pow(-1, i);
                i++;
            }
            double pi = sum * 4;
            System.out.println(pi);
        }

    }
}
