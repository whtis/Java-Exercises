/**
 * Created by ht on 2015/12/5.
 */
public class $5_15 {
    public static void main(String[] args) {
        double[] lists = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        for (int i = 1; i < lists.length; i++) {
            double currentElement = lists[i];
            int k = i - 1;
            while (k >= 0 && lists[k] > currentElement) {
                double tmp = lists[k + 1];
                lists[k + 1] = lists[k];
                lists[k] = tmp;
                k--;
            }
        }

        //输出数组
        for (double list : lists) {
            System.out.print(list + " ");
        }
    }
}
