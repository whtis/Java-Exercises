package example;
/**
 * Created by ht on 2016/1/5.
 */
public class Cylinder9 extends Circle9 {
    private double length;

    public Cylinder9() {
        this(1.0, 1.0);
    }

    public Cylinder9(double radius, double length) {
        this(radius, "white", false, length);
    }

    public Cylinder9(double radius, String color, boolean filled, double length) {
        super(radius, color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return 2 * super.findArea() + 2 * getRadius() * Math.PI * length;
    }

    @Override
    public double findPerimeter() {
        return super.findArea() * length;
    }

    public String toString() {
        return "[Cylinder] radius = " + getRadius() + " and length " + length;
    }
}
