package _9_3;

import example.GeometricObject;

/**
 * Created by ht on 2016/1/5.
 */
public class Square extends GeometricObject implements Colorable {

    private double edge;

    public Square() {
        this("white", false, 1.0);
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    @Override
    public double findArea() {
        return edge * edge;
    }

    @Override
    public double findPerimeter() {
        return edge * 4;
    }

    @Override
    public void howToColor() {
        if (this.findArea() != 0 && getColor() != null) {
            setFilled(true);
        }
    }
}
