import java.util.*;

/**
 * Created by ht on 2016/3/5.
 */
public class Test {

    public static void main(String[] args) {
        String s = "abcauiojkl";
        int i = lengthOfLongestSubstring(s);
        int a = 0;
    }

    public static int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (list.contains(c)) {
                int situation = list.indexOf(c);
                for (int i = 0; i < situation; i++) {
                    list.remove(i);
                }
            } else {
                list.add(String.valueOf(c));
            }
        }
        return list.size();
    }
}