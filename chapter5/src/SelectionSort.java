import java.util.Arrays;

/**
 * Created by ht on 2015/11/29.
 */
public class SelectionSort {
    public static void main(String[] args) {
        double[] lists = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
//        for (int i = 0; i < lists.length; i++) {
//            for (int j = lists.length - 1; j > i; j--) {
//                if (lists[i] > lists[j]) {
//                    double tmp = lists[i];
//                    lists[i] = lists[j];
//                    lists[j] = tmp;
//                }
//            }
//        }

        for (int i = lists.length - 1; i >= 1; i--) {
            double max = lists[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (max < lists[j]) {
                    max = lists[j];
                    index = j;
                }
            }

            //交换list[i]和max所在的list[index]的值
            if (index != i) {
                lists[index] = lists[i];
                lists[i] = max;
            }
        }

        for (double list : lists) {
            System.out.print(list + " ");
        }

        System.out.println();

        double[] bbb = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        Arrays.sort(bbb);
        for (double bb : bbb) {
            System.out.print(bb + " ");
        }
    }
}
