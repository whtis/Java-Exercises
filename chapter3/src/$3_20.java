import java.util.Scanner;

/**
 * Created by w on 15-11-18.
 */
public class $3_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数，以空格隔开： ");
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int gcd = 1;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int k = a;k>0;k--) {
            if (a % k == 0 && b % k == 0) {
                gcd = k;
                break;
            }
        }
        System.out.println("the greatest CommonDivisor is " + gcd);
    }
}
