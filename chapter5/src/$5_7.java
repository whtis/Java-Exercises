/**
 * Created by ht on 2015/12/3.
 */
public class $5_7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int c = (int) (Math.random() * 10);
            counts[c]++;
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }
}
