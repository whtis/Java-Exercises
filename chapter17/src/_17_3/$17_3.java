package _17_3;

/**
 * Created by ht on 2016/3/21.
 */
public class $17_3 {
    public static void main(String[] args) {
        String[] strings = {"Tom", "George", "Michael", "Michelle", "Daniel"};
        DoubleLinkedList list = new DoubleLinkedList(strings);

        list.add(3, "Jim");
        list.remove(2);
        list.remove("George");
        System.out.print(list);
    }
}
