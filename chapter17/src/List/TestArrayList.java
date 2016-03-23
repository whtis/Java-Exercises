package List;

/**
 * Created by ht on 2016/3/19.
 */
public class TestArrayList {
    public static void main(String[] args) {
        Object[] objects = new Object[20];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = i;
        }

        MyArrayList list = new MyArrayList(objects);
        System.out.print(list.size());
    }
}
