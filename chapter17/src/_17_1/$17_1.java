package _17_1;

/**
 * Created by ht on 2016/3/20.
 */
public class $17_1 {
    public static void main(String[] args) {
        String[] s1 = {"Tom", "George", "Peter", "Jean", "Jane"};
        String[] s2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};

        AbstractList list1 = new SeventeenList(s1);
        AbstractList list2 = new SeventeenList(s2);

        list1.addAll(list2);
        System.out.println("after addAll: " + list1);

        list1.removeAll(list2);
        System.out.println("after removeAll: " + list1);

        list1.retainAll(list2);
        System.out.println("after retainAll: " + list1);
    }
}
