import sun.nio.cs.ext.ISCII91;

import java.io.*;
import java.util.Arrays;

/**
 * Created by ht on 2016/2/20.
 */
public class $16_10 {
    public static void main(String[] args) throws IOException {
        File file = new File("testFile/Exercise16_7.w");
        if (file.exists()) {
            System.out.println("文本文件大小为： " + file.length());
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        DataOutputStream os = new DataOutputStream(new FileOutputStream("testFile/Exercise16_10.w"));

        String s;
        while ((s = br.readLine()) != null) {
            os.writeUTF(s);
        }
        os.flush();
        os.close();

        File binaryFile = new File("testFile/Exercise16_10.w");

        DataInputStream is = new DataInputStream(new FileInputStream(binaryFile));
        String str;
        while ((is.available() != 0)) {
            str = is.readUTF();
            System.out.println(str);
        }
        System.out.println("binaryFile's size is " + binaryFile.length());
        is.close();
    }
}
