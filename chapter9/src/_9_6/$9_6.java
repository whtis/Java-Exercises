package _9_6;

/**
 * Created by ht on 2016/1/6.
 */
public class $9_6 {
    public static void main(String[] args) {
        ComparableRectangle cr1 = new ComparableRectangle(4, 5);
        ComparableRectangle cr2 = new ComparableRectangle(4, 5);
        System.out.println(cr1.equals(cr2));
        System.out.println(cr1.compareTo(cr2));
    }
}
