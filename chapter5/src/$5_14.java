/**
 * Created by ht on 2015/12/3.
 */
public class $5_14 {
    public static void main(String[] args) {
        double[] numbers = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        boolean changed = true;
        do {
            changed = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    double tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    changed = true;
                }
            }
        } while (changed);

        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }
}
