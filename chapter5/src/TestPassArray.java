/**
 * Created by ht on 2015/11/29.
 */
public class TestPassArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2};
        System.out.println("before enter the swap,the list is ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        swap(numbers[0], numbers[1]);
        System.out.println("after enter the swap,the list is ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        swapArray(numbers);
        System.out.println("after enter the swapArray,the list is ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void swap(int number, int number1) {
        number = 30;
        number1 = 40;
    }

    private static void swapArray(int[] numbers) {
        numbers[0] = 30;
        numbers[1] = 40;
    }
}
