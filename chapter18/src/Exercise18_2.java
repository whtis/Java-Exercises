import java.io.*;
import java.util.*;

/**
 * Created by ht on 2016/3/31.
 */
public class Exercise18_2 {
    public static void main(String[] args) throws Exception {
//        File file = new File(args[0]);
        File file = new File("text/exercise2");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(s).append("\n");
        }

        br.close();

        Set set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(sb.toString(), " ,‘’.“”!?");
        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        TreeSet treeSet = new TreeSet(set);
        System.out.println(treeSet);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}
