/**
 * Created by ht on 2015/11/26.
 */
public class $4_20 {
    public static void main(String[] args) {
        int n = 10;
        computeFib(n);
    }

    private static void computeFib(int n) {
        int f0 = 0;
        int f1 = 1;
        for (int i = 0; i < n; i++) {
            int f3 = f0 + f1;
            System.out.print(f3 + " ");
            f0 = f1;
            f1 = f3;
        }
    }
}
