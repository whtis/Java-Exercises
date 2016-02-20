import java.io.*;
import java.util.Date;

/**
 * Created by ht on 2016/2/20.
 */
public class $16_11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++) {
            ints[i] = i + 1;
        }
        double d = 5.5;

        File file = new File("testFile/Exercise16_11.w");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
        os.writeObject(ints);
        os.writeObject(new Date());
        os.writeDouble(d);
        os.flush();
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
        int[] ints1 = (int[]) (is.readObject());
        Date date = (Date) (is.readObject());
        double dd = is.readDouble();
        is.close();

        for (int i = 0; i < ints.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(date);
        System.out.println(dd);
    }
}
