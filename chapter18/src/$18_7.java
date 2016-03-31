import java.util.*;

/**
 * Created by ht on 2016/3/31.
 */
public class $18_7 {
    public static void main(String[] args) {
        String text = "Have a good day. Have a good class. " + "Have a good visit,Have fun!";

        Map hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(text, " .,!?");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();

            if (hashMap.get(key) != null) {
                int value = ((Integer) hashMap.get(key)).intValue();
                value++;
                hashMap.put(key, value);
            } else {
                hashMap.put(key, new Integer(1));
            }
        }

        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();

        List<WordOccurrence> list = new ArrayList<>();

        while (iterator.hasNext()) {
            String key1 = (String) iterator.next();
            int value1 = (Integer) hashMap.get(key1);
            WordOccurrence w1 = new WordOccurrence(key1, value1);
            list.add(w1);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).word + " " + list.get(i).count);
        }
    }
}

class WordOccurrence implements Comparable {

    String word;
    int count;

    public WordOccurrence(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        if (count > ((WordOccurrence) o).count) {
            return 1;
        } else if (count < ((WordOccurrence) o).count) {
            return -1;
        } else {
            return 0;
        }
    }
}