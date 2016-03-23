package _17_1;
/**
 * Created by ht on 2016/3/20.
 */
public class SeventeenList extends AbstractList {
    private Node first, last;

    public SeventeenList() {
    }

    public SeventeenList(Object[] objects) {
        super(objects);
    }

    public Object getFirst() {
        if (size == 0) return null;
        else return first.element;
    }

    public Object getLast() {
        if (size == 0) return null;
        else return last.element;
    }

    @Override
    public void add(int index, Object o) {
        if (index == 0) {
            addFirst(o);
        } else if (index >= size) {
            addLast(o);
        } else {
            Node current = first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(o);
            (current.next).next = temp;
            size++;
        }
    }

    public void addFirst(Object o) {
        Node newNode = new Node(o);
        newNode.next = first;
        first = newNode;
        size++;

        if (last == null) {
            last = first;
        }
    }

    public void addLast(Object o) {
        if (last == null) {
            first = last = new Node(o);
        } else {
            last.next = new Node(o);
            last = last.next;
        }

        size++;
    }

    public Object removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node temp = first;
            first = first.next;
            size--;
            return temp.element;
        }
    }

    //exercise by whtis
    public Object removeLast() {
        if (size == 0) {
            return null;
        } else {
            Node current = first;
            for (int i = 1; i < size - 1; i++) {
                current = current.next;
            }
            Node temp = last;
            last = current;
            current.next = null;
            size--;
            return temp.element;
//            remove(size - 1);
        }
    }

    @Override
    public void clear() {
        first = last = null;
    }

    //exercise by whtis
    @Override
    public boolean contains(Object o) {
        Node temp = first;
        for (int i = 1; i < size; i++) {
            if (temp.element.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //by whtis
    @Override
    public Object get(int index) {
        if (index == 0) {
            return first.element;
        } else if (index == size - 1) {
            return last.element;
        } else if (index > 0 && index < size) {
            Node current = first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            return current.next.element;
        }
        return -1;
    }

    //by whtis
    @Override
    public int indexOf(Object o) {
        Node current = first;
        for (int i = 1; i < size; i++) {
            if (o.equals(current.element)) {
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    //by whtis
    @Override
    public int lastIndexOf(Object o) {
        StringBuilder sbIndex = new StringBuilder();
        int index = 1;
        Node current = first;
        while (index <= size) {
            if (current.element.equals(o)) {
                sbIndex.append(index);
            }
            current = current.next;
            index++;
        }

        //change to string so that we can use length to judge
        String str = sbIndex.toString();
        if (str.length() == 0) {
            return -1;
        } else {
            String s = str.substring(sbIndex.length() - 1);
            return Integer.parseInt(s);
        }
    }

    @Override
    public boolean remove(Object o) {
        Node current = first;
        for (int i = 1; i < size; i++) {
            if (current.element.equals(o)) {
                remove(i - 1);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node previous = first;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    //by whtis
    @Override
    public Object set(int index, Object o) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.element = o;
        return o;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(",");
            } else result.append("]");
        }

        if (!result.toString().endsWith("]")) {
            result.append("]");
        }
        return result.toString();
    }
}
