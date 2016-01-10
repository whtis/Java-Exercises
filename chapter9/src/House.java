import java.util.Date;

/**
 * Created by ht on 2016/1/6.
 */
public class House implements Cloneable, Comparable {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
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
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        if (area > ((House) o).getArea()) {
            return 1;
        } else if (area < ((House) o).getArea()) {
            return -1;
        } else return 0;
    }
}
