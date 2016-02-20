import java.io.*;

/**
 * Created by ht on 2016/2/20.
 */
public class $16_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("testFile/Exercise16_8.w");
        FileOutputStream os = null;
        if (file.exists()) {
            os = new FileOutputStream(file, true);
        } else
        os  = new FileOutputStream(file);

        for (int i = 0; i < 100; i++) {
            os.write((int) (Math.random() * 100));
        }
        os.flush();
        os.close();

        FileInputStream is = new FileInputStream(file);
        int c;
        while (is.read() != -1) {
            c = is.read();
            System.out.print(c);
            System.out.print(" ");
        }
        is.close();
    }

}
