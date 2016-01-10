import java.util.StringTokenizer;

/**
 * Created by ht on 2015/12/15.
 */
public class Exercise7_18b {
    public static void main(String[] args) {
        String str = args[0];
        int sum = 0;
        StringTokenizer tokenizer = new StringTokenizer(str," ");
        while (tokenizer.hasMoreTokens()) {
            sum += Integer.parseInt(tokenizer.nextToken());
        }
        System.out.println(sum);
    }

}
