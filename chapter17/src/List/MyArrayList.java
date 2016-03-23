package List;

/**
 * Created by ht on 2016/3/15.
 */
public class MyArrayList extends MyAbstractList {

    public static final int INITIAL_CAPACITY = 16;
    private Object[] data = new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }

    public MyArrayList(Object[] objects) {
        data = objects;
        size = objects.length;
    }

    @Override
    public void add(int index, Object o) {
        ensureCapacity();

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = o;

        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }

    }

    @Override
    public void clear() {
        data = new Object[INITIAL_CAPACITY];
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(data[i])) return i;
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        Object o = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;

        return o;
    }

    @Override
    public Object set(int index, Object o) {
        data[index] = o;
        return o;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i<size-1) result.append(",");
        }

        return result.toString() + "]";
    }
}
