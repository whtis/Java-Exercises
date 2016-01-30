/**
 * Created by ht on 2016/1/29.
 */
public class $10_1 {
    public static void main(String[] args) {
        //test the result
//        double n = 1;
//        double sum = 0;
//        while (n < 100) {
//            sum += n / (n + 1);
//            n++;
//        }
//        System.out.println(sum);

        //when n = 23 the numerator is too large and may appear "/ by zero"
        long n = 1;
        Rational sum = new Rational();
        while (n < 100) {
            Rational r = new Rational(n, n + 1);
            sum = sum.add(r);
            n++;
        }
        System.out.println(sum);

        //change the result to the double everytime can get the right answer
//        long m = 1;
//        double sum1 = 0;
//        while (m < 100) {
//            Rational r = new Rational(m, m + 1);
//            sum1 += r.doubleValue();
//            m++;
//        }
//        System.out.println(sum1);
    }
}
