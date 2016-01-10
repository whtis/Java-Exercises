/**
 * Created by ht on 2015/11/26.
 */
public class $4_15 {
    public static void main(String[] args) {
        double sum = 0;
        double product = 0;
        double mean = 0;
        double deviation = 0;
        for (int i = 0; i < 9; i++) {
            double a = Math.random() * 1000;
            sum += a;
            product += a * a;
        }
        mean = sum / 10;
        deviation = Math.sqrt((product - mean * mean / 10) / 9);
        System.out.println("10个数的均值为 " + mean + ",标准差为 " + deviation);
    }
}
