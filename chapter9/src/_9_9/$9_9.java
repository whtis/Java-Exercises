package _9_9;

import java.util.Date;
import java.util.Random;

/**
 * Created by ht on 2016/1/6.
 */
public class $9_9 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        Integer[] integers = new Integer[10];
        Date[] dates = new Date[10];

        for (int i = 0; i < 10; i++) {
            char c = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            strings[i] = String.valueOf(c);
            integers[i] = (int) ('0' + Math.random() * ('Z' - '0' + 1));
            dates[i] = new Date();
        }
        System.out.println(max(strings));
        System.out.println(max(integers));
        System.out.println(max(dates));
    }

    private static Object max(Object[] o) {
        int index;
        Object o1 = o[0];
        for (int i = 0; i < o.length; i++) {
            if (((Comparable) o1).compareTo(o[i]) < 0) {
                index = i;
                o1 = o[i];
            }
        }
        return o1;
    }
}
