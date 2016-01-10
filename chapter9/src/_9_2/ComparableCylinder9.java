package _9_2;

import _9_1.ComparableCircle9;

/**
 * Created by ht on 2016/1/5.
 */
public class ComparableCylinder9 extends ComparableCircle9 {
    private double length;

    public ComparableCylinder9() {
        this(1.0, 1.0);
    }

    public ComparableCylinder9(double radius, double length) {
        this(radius, "white", false, length);
    }

    public ComparableCylinder9(double radius, String color, boolean filled, double length) {
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

    @Override
    public int compareTo(Object o) {
        if (this.findPerimeter() > ((ComparableCylinder9) o).findPerimeter()) {
            return 1;
        } else if (this.findPerimeter() < ((ComparableCylinder9) o).findPerimeter()) {
            return -1;
        } else return 0;
    }

    public String toString() {
        return "[Cylinder] radius = " + getRadius() + " and length " + length;
    }
}
