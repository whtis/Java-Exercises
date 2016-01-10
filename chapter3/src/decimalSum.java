/**
 * Created by ht on 2015/11/10.
 */
public class decimalSum {
    public static void main(String[] args) {
        double a = 0.01;
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += a;
            a = a + 0.01;
        }
        System.out.println(sum);
    }
}
