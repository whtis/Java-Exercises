package _9_6;

import example.GeometricObject;
import example.Rectangle;

/**
 * Created by ht on 2016/1/5.
 */
public class ComparableRectangle extends GeometricObject implements Comparable {

    private double width;
    private double height;

    public ComparableRectangle() {
        this(1.0, 1.0);
    }

    public ComparableRectangle(double width, double height) {
        this(width, height, "white", false);
    }

    public ComparableRectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }

    @Override
    public double findPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "[ComparableRectangle] width= " + width + " and height " + height;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.findArea() != ((ComparableRectangle) obj).findArea()) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if (this.findArea() > ((ComparableRectangle) o).findArea()) {
            return 1;
        } else if (this.findArea() < ((ComparableRectangle) o).findArea()) {

            return -1;
        } else return 0;
    }
}
