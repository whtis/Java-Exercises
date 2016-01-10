/**
 * Created by ht on 2015/12/15.
 */
//传入不定个数的整数
public class Exercise7_18a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
