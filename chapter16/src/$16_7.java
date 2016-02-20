import java.io.*;
import java.util.*;

/**
 * Created by ht on 2016/2/19.
 */
public class $16_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("testFile/Exercise16_7.w");
        BufferedWriter bw;
        if (file.exists()) {
            bw = new BufferedWriter(new FileWriter(file,true));
        }
        bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * 100);
            bw.write(String.valueOf(a));
            bw.write(" ");
        }
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(str, " ");
        int[] ints = new int[st.countTokens()];
        for (int i = 0; i < st.countTokens(); i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println("before sort:");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        System.out.println("After sort:");
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
