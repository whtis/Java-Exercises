package _8_4;

/**
 * Created by ht on 2015/12/17.
 */
public class StackOfObjects {
    private int size = 0;
    Object[] elements;

    public StackOfObjects() {
        elements = new Object[16];
    }

    public StackOfObjects(int capacity) {
        elements = new Object[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(Object value) {
        if (size >= elements.length) {
            Object[] objects = elements;
            elements = new Object[elements.length * 2];
            System.arraycopy(objects, 0, elements, 0, objects.length);
        }
        elements[size++] = value;
    }

    public Object peek() {
        return elements[size - 1];
    }

    public Object pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
