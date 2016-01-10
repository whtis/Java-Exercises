/**
 * Created by ht on 2015/12/9.
 */
public class StackInteger {
    private int size = 0;
    private int[] elements;


    public StackInteger() {
        this(16);
    }

    public StackInteger(int capacity) {
        elements = new int[capacity];
    }

    public int push(int value) {
        if (size >= elements.length) {
            int[] tmp = new int[elements.length * 2];
            System.arraycopy(elements, 0, tmp, 0, elements.length);
            elements = tmp;
        }
        return elements[size++] = value;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int pop() {
        return elements[--size];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}











