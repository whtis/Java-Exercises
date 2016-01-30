
/**
 * Created by ht on 2016/1/29.
 */
public class Rational extends Number implements Comparable {
    private long numerator; //分子
    private long denominator;  //分母

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long k = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / k;
        this.denominator = Math.abs(denominator) / k;
    }

    //是否需要使用静态的？
    private long gcd(long n1, long n2) {
        long n = Math.abs(n1);
        long d = Math.abs(n2);
        long k = 1;
        for (int i = 1; i <= n && i <= d; i++) {
            if (n % i == 0 && d % i == 0) {
                k = i;
            }
        }
        return k;
    }

    public Rational add(Rational sR) {
        long n = this.numerator * sR.getDenominator() + sR.getNumerator() * this.denominator;
        long d = this.denominator * sR.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational sR) {
        long n = this.numerator * sR.getDenominator() - sR.getNumerator() * this.denominator;
        long d = this.denominator * sR.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational sR) {
        long n = this.getNumerator() * sR.getDenominator();
        long d = this.denominator * sR.getNumerator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational sR) {
        long n = this.numerator * sR.getNumerator();
        long d = this.denominator * sR.getDenominator();
        return new Rational(n, d);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.getNumerator() * 1.0 / this.getDenominator();
    }

    @Override
    public int compareTo(Object o) {
        Rational ra = (Rational) o;
        if (this.subtract(ra).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(ra).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        return new Double(this.doubleValue()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.subtract((Rational) obj).getNumerator() == 0) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (this.getDenominator() == 1) {
            return this.getNumerator() + "";
        }
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }
}
