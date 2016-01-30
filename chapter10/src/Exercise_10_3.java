import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by ht on 2016/1/29.
 */
public class Exercise_10_3 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("args's length should be 3");
            System.exit(0);
        }
        Rational r1 = new Rational();
        Rational r2 = new Rational();
        Rational r3 = new Rational();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i+=2) {
            StringTokenizer st = new StringTokenizer(args[i], "/", false);
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        if (list.size() == 4) {
            r1 = new Rational(list.get(0), list.get(1));
            r2 = new Rational(list.get(2), list.get(3));
        }
        switch (args[1].charAt(0)) {
            case '+':
                r3 = r1.add(r2);
                break;
            case '-':
                r3 = r1.subtract(r2);
                break;
            case '*':
                r3 = r1.multiply(r2);
                break;
            case '/':
                r3 = r1.divide(r2);
                break;
            default:

        }

        System.out.println(args[0] + args[1] + args[2] + " = " + r3);
    }
}
