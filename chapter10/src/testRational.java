/**
 * Created by ht on 2016/1/29.
 */
public class testRational {
    public static void main(String[] args) {
//        Rational r1 = new Rational(4, 2);
//        Rational r2 = new Rational(2, 3);
//        Rational r3 = new Rational(2, 3);
//
//        System.out.println(r1.add(r2));
//        System.out.println(r1.subtract(r2));
//        System.out.println(r1.multiply(r2));
//        System.out.println(r1.divide(r2));
//        System.out.println(r1.compareTo(r2));
//        System.out.println(r3.compareTo(r2));
//        System.out.println(r3.equals(r2));
//        System.out.println(r1.hashCode());
//        System.out.println(r2.hashCode());
//        System.out.println(r3.hashCode());
//        System.out.println(r3.doubleValue());

        Number r = new Rational();
        System.out.println(r);
        System.out.println(r.doubleValue());
        System.out.println(((Rational) r).add(new Rational()));

        Comparable tt = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
