package example;

import example.GeometricObject;

/**
 * Created by ht on 2016/1/5.
 */
public class Circle9 extends GeometricObject {
    private double radius;

    public Circle9() {
        this(1.0);
    }

    public Circle9(double radius) {
        this(radius, "white", false);
    }

    public Circle9(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
