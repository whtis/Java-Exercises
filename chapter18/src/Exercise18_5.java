import java.io.*;
import java.util.*;

/**
 * Created by ht on 2016/3/31.
 */
public class Exercise18_5 {
    public static void main(String[] args) throws IOException {
//        File file = new File(args[0]);
        File file = new File("text/exercise2");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(s).append("\n");
        }

        br.close();

        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(sb.toString().replaceAll("\\n", ""), " ,‘’.“”!?");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        list.sort(new DicComparable());

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}

class DicComparable implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = ((String) (o1)).toLowerCase();
        String s2 = ((String) (o2)).toLowerCase();

        if (s1.compareTo(s2) > 0) {
            return 1;
        } else if (s1.compareTo(s2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}