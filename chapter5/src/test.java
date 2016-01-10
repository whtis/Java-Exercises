/**
 * Created by ht on 2015/11/27.
 */
public class test {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        for (int i = 0; i < array[0].length; i++) {
            System.out.println(array[0][i]);
        }

    }
}
