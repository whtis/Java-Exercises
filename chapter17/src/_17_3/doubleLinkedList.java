package _17_3;

import List.*;


/**
 * Created by ht on 2016/3/20.
 */
public class DoubleLinkedList extends MyAbstractList {

    TreeNode first, last;

    public DoubleLinkedList() {
    }

    public DoubleLinkedList(Object[] objects) {
        super(objects);
    }

    @Override
    public void add(int index, Object o) {
        if (index == 0) {
            addFirst(o);
        } else if (index >= size) {
            addLast(o);
        } else {
            TreeNode current = first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            TreeNode temp = current.next;
            TreeNode newTreeNode = new TreeNode(o);
            current.next = newTreeNode;
            newTreeNode.pravious = current;
            newTreeNode.next = temp;
            temp.pravious = newTreeNode;
            size++;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    public void addFirst(Object o) {
        TreeNode newNode = new TreeNode(o);
        newNode.next = first;
        first = newNode;
        first.pravious = last;
        size++;

        if (last == null) {
            last = first;
        }
    }

    public void addLast(Object o) {
        if (last == null) {
            first = last = new TreeNode(o);
        } else {
            TreeNode lastNode = new TreeNode(o);
            last.next = lastNode;
            lastNode.pravious = last;
            last = last.next;
        }
        size++;
    }

    @Override
    public boolean remove(Object o) {
        TreeNode current = first;
        for (int i = 0; i < size; i++) {
            current = current.next;
            if (((Comparable) o).compareTo(current.element) == 0) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        TreeNode current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        TreeNode target = current.next;
        target.pravious.next = target.next;
        target.next.pravious = target.pravious;
        size--;
        return true;
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        TreeNode current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(",");
            } else result.append("]");
        }

        return result.toString();
    }
}
