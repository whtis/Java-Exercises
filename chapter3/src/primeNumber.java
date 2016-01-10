/**
 * Created by ht on 2015/11/11.
 */
public class primeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME = 50;
        int count = 0;
        int number = 2;
        boolean isPrime = true;

        while (count < NUMBER_OF_PRIME) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            isPrime = true;
            number++;
        }
    }
}
