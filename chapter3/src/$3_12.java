/**
 * Created by ht on 2015/11/17.
 */
public class $3_12 {
    public static void main(String[] args) {
        double dd = 10000;
        System.out.println("第 1 年的学费为 $" + dd);
        double sum = dd;
        for (int i = 2; i <= 10; i++) {
            dd += dd * 0.05;
            System.out.println("第 " + i + " 年的学费为 $" + dd);
            sum += dd;
        }
        System.out.println("十年总的学费为： $" + sum);
    }
}
