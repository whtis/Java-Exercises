package _9_1;

/**
 * Created by ht on 2016/1/5.
 */
public class ComparableCircle9 extends ComparableGeometricObject {
    private double radius;

    public ComparableCircle9() {
        this(1.0);
    }

    public ComparableCircle9(double radius) {
        this(radius, "white", false);
    }

    public ComparableCircle9(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        if (this.findArea() > ((ComparableCircle9) o).findArea()) {
            return 1;
        } else if (this.findArea() < ((ComparableCircle9) o).findArea()) {
            return -1;
        } else return 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "[Circle] radius= " + radius;
    }
}
