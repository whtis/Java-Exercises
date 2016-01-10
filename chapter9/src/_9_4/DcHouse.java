package _9_4;

import java.util.Date;

/**
 * Created by ht on 2016/1/6.
 */

/**
 * deep copy of whenBuilt
 */
public class DcHouse implements Cloneable, Comparable {
    private int id;
    private double area;
    private Date whenBuilt;

    public DcHouse(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DcHouse dcHouse = new DcHouse(id, area);
        return dcHouse;
    }

    @Override
    public int compareTo(Object o) {
        if (area > ((DcHouse) o).getArea()) {
            return 1;
        } else if (area < ((DcHouse) o).getArea()) {
            return -1;
        } else return 0;
    }
}
