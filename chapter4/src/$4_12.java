import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by ht on 2015/11/26.
 */
public class $4_12 {
    public static void main(String[] args) {
        showSqrt();
    }

    private static void showSqrt() {
        DecimalFormat df = new DecimalFormat("###.####");
//        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("\t数字\t平方根");
        for (int i = 1; i <= 10; i++) {
            System.out.print("\t" + i * 2 + "\t\t" + df.format(Math.sqrt(i * 2)));
            System.out.println();
        }
    }
}
