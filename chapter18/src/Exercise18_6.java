import java.io.*;
import java.util.*;

/**
 * Created by ht on 2016/3/31.
 */
public class Exercise18_6 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (args.length == 0) {
            return;
        } else {
            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]).append(" ");
            }
        }

        int max = 0;
        Map map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(sb.toString(), " ");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            if (map.get(key) != null) {
                int value = ((Integer) map.get(key)).intValue();
                value++;
                if (max < value) {
                    max = value;
                }
                map.put(key, value);
            } else {
                map.put(key, new Integer(1));
            }
        }

        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            int value = ((Integer) map.get(key)).intValue();
            if (value == max) {
                System.out.print(key + " ");
            }
        }
    }
}
