package _8_4;

/**
 * Created by ht on 2015/12/17.
 */
public class $8_4 {
    public static void main(String[] args) {
        //show prime
        int count = 0;
        StackOfObjects stackOfObjects = new StackOfObjects();
        for (int i = 1; i < 250; i++) {
            boolean b = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                stackOfObjects.push(i);
                count++;
            }
            if (count == 50) {
                break;
            }
        }


        //show primes
        while (!stackOfObjects.empty()) {
            System.out.println((Integer)stackOfObjects.pop());
        }
    }
}
