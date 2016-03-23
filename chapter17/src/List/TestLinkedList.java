package List;

import List.MyLinkedList;

/**
 * Created by ht on 2016/3/15.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("Tom");
        System.out.println("1." + linkedList);

        linkedList.add(0, "John");
        System.out.println("2." + linkedList);

        linkedList.add("George");
        System.out.println("3." + linkedList);

        linkedList.add("Michael");
        System.out.println("4." + linkedList);

        linkedList.add(2, "Michelle");
        System.out.println("5." + linkedList);

        linkedList.removeLast();
        System.out.println("6." + linkedList);

        System.out.println(linkedList.contains("Michael"));

        System.out.println(linkedList.get(3));

        linkedList.add("Tom");
        System.out.println(linkedList.indexOf("Tom"));
        System.out.println(linkedList.lastIndexOf("Tom"));

        System.out.println(linkedList);
        linkedList.remove("Tom");
        System.out.println(linkedList);

        linkedList.set(2, "whtis");
        System.out.println(linkedList);
    }
}
