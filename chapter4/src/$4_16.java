/**
 * Created by ht on 2015/11/26.
 */
public class $4_16 {
    static double num = 0;
    public static void main(String[] args) {
        num = 16;
        double lastGuess = num;
        computeSqrt(lastGuess);

    }

    private static void computeSqrt(double lastGuess) {
        double nextGuess = (lastGuess + (num / lastGuess)) / 2;
        if (lastGuess - nextGuess < 0.0001) {
            System.out.println(nextGuess);
        } else
            computeSqrt(nextGuess);
    }

}
