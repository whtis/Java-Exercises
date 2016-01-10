/**
 * Created by ht on 2015/12/3.
 */
public class $5_12 {
    public static void main(String[] args) {
        double[] numbers = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        selectionSort(numbers, numbers.length - 1);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void selectionSort(double[] numbers, int length) {
        double max = numbers[0];
        int index = 0;
        for (int i = 0; i <= length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        if (index != length) {
            numbers[index] = numbers[length];
            numbers[length] = max;
        }
        if (length > 0) {
            length--;
            selectionSort(numbers, length);
        }
    }
}
