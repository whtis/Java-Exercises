package List;

/**
 * Created by ht on 2016/3/8.
 */
public abstract class MyAbstractList implements MyList {
    protected int size;

    protected MyAbstractList() {
    }

    protected MyAbstractList(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            this.add(objects[i]);
        }
    }

    @Override
    public void add(Object o) {
        add(size,o);
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
