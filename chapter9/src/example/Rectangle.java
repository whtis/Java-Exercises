package example;

/**
 * Created by ht on 2016/1/5.
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this(width, height, "white", false);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
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
}
