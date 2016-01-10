package example;

/**
 * Created by ht on 2016/1/5.
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**Abstract method findArea*/
    public abstract double findArea();

    /**
     * Abstract method findPerimeter
     */
    public abstract double findPerimeter();

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
