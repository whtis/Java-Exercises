import java.util.Scanner;

/**
 * Created by w on 15-11-18.
 */
public class $3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num = scanner.nextInt();
        getPrime(num);
    }

   static void getPrime(int num) {
        boolean isPrime = true;
        int prime = 0;
        for (int i = num; i > 1; i--) {
            isPrime = true;
            if (num % i == 0) {
                prime = i;
                for (int j = 2; j < prime; j++) {
                    if (prime % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(prime);
                    num = num / i;
                    getPrime(num);
                    break;
                }
            }
        }
    }
}
