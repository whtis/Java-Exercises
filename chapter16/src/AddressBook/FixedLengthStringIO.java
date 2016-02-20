package AddressBook;

import java.io.*;

/**
 * Created by ht on 2016/2/19.
 */
public class FixedLengthStringIO {
    public static String readFixedLengthString(int size, DataInput in) throws IOException {
        char[] chars = new char[size];

        for (int i = 0; i < size; i++) {
            chars[i] = in.readChar();
        }
        return new String(chars);
    }

    public static void writeFixedLengthString(String s,int size,DataOutput out) throws IOException {
        char[] chars = new char[size];
        s.getChars(0, s.length(), chars, 0);

        for (int i = Math.min(s.length(), size); i < chars.length; i++) {
            chars[i] =' ';
        }
        out.writeChars(new String(chars));
    }
}
