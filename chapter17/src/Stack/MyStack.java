package Stack;

import List.*;

/**
 * Created by ht on 2016/3/15.
 */
public class MyStack {
    private MyArrayList list = new MyArrayList();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(o);
        return o;
    }

    public Object push(Object o) {
        list.add(o);
        return o;
    }

    public int search(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
