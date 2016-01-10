/**
 * Created by w on 15-11-18.
 */
public class $3_25 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        boolean isPrime = true;

        while (number <= 2000) {
            isPrime = true;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%5s" ,number + " ");
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
        System.out.println();
        System.out.println("2000以内的素数总共有： " + count + " 个");
    }
}
