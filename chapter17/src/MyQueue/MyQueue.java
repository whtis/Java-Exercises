package MyQueue;

import List.MyLinkedList;

/**
 * Created by ht on 2016/3/15.
 */
public class MyQueue {
    private MyLinkedList list = new MyLinkedList();

    public void enqueue(Object o) {
        list.addLast(o);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
