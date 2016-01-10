package _9_1;

/**
 * Created by ht on 2016/1/5.
 */
public abstract class ComparableGeometricObject implements Comparable {
    private String color = "white";
    private boolean filled;

    public ComparableGeometricObject() {

    }

    public ComparableGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Abstract method findArea
     */
    public abstract double findArea();

    /**
     * Abstract method findPerimeter
     */
    public abstract double findPerimeter();

    /**
     * Abstract method max
     */
    public static Object max(Object o1, Object o2) {
        if (((Comparable) o1).compareTo(o2) > 0) {
            return o1;
        } else
            return o2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
