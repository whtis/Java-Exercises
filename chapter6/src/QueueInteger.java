/**
 * Created by ht on 2015/12/9.
 */
public class QueueInteger {
    private int size = 0;
    private int[] elements;

    public QueueInteger() {
        this(16);
    }

    public QueueInteger(int i) {
        elements = new int[i];
    }

    public int push(int value) {
        if (size >= elements.length) {
            int[] tmp = elements;
            elements = new int[elements.length * 2];
            System.arraycopy(tmp, 0, elements, 0, tmp.length);
        }
        return elements[size++] = value;
    }

    public int peek() {
        return elements[0];
    }

    public int pop() {
        int tmp = elements[0];
        System.arraycopy(elements, 1, elements, 0, elements.length - 1);
        size--;
        return tmp;
    }

    public boolean empty() {
        return size == 0;
    }
}
