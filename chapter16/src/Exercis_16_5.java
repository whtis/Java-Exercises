import java.io.*;

/**
 * Created by ht on 2016/2/19.
 */
public class Exercis_16_5 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java file1 deleteString file2 ");
            System.exit(0);
        }

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String deleteStr = args[1];
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

        String s;
        while ((s = br.readLine()) != null) {
            if (s.contains(deleteStr)) {
                s = s.replaceAll(deleteStr, "");
            }
            bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
