package _17_1;

import List.MyList;

/**
 * Created by ht on 2016/3/20.
 */
public abstract class AbstractList implements MyList {
    protected int size;

    protected AbstractList() {
    }

    protected AbstractList(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            this.add(objects[i]);
        }
    }

    @Override
    public void add(Object o) {
        add(size, o);
    }

    public boolean addAll(MyList otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
        return true;
    }

    public boolean removeAll(MyList otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            while (indexOf(otherList.get(i)) != -1) {
                remove(otherList.get(i));
            }
        }
        return true;
    }

    public boolean retainAll(MyList otherList) {
        int a = otherList.size();
        for (int i = a; i >=0; i--) {
            if (!contains(otherList.get(i))) {
                otherList.remove(i);
            }
        }
        this.clear();
        this.size = 0;
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

}
