import java.util.*;

/**
 * Created by ht on 2016/3/30.
 */

/**
 * 备份的时候不能简单的将引用传递，应新建一个集合
 */
public class $18_1 {
    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();

        hashSet1.add("George");
        hashSet1.add("Jim");
        hashSet1.add("John");
        hashSet1.add("Blake");
        hashSet1.add("Kevin");
        hashSet1.add("Michael");

        hashSet2.add("George");
        hashSet2.add("Katie");
        hashSet2.add("Kevin");
        hashSet2.add("Michael");
        hashSet2.add("Ryan");

        Set s1 = new HashSet<>(hashSet1);

        hashSet1.addAll(hashSet2);
        System.out.println("after addAll: " + hashSet1);
        hashSet1 = new HashSet<String>(s1);
        hashSet1.removeAll(hashSet2);
        System.out.println("after removeAll: " + hashSet1);
        hashSet1 = new HashSet<String>(s1);
        hashSet1.retainAll(hashSet2);
        System.out.println("after retainAll: " + hashSet1);
    }
}
