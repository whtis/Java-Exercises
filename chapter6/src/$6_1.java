/**
 * Created by ht on 2015/12/12.
 */
public class $6_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40, "yellow");
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println(r1.getColor());
        System.out.println(r1.findArea());
        System.out.println(r1.findPerimeter());
        System.out  .println("---------------------------------");
        Rectangle r2 = new Rectangle();
        r2.setColor("yellow");
        r2.setHeight(40);
        r2.setWidth(4);
        System.out.println(r2.getHeight());
        System.out.println(r2.getWidth());
        System.out.println(r2.getColor());
        System.out.println(r2.findArea());
        System.out.println(r2.findPerimeter());
    }

}


class Rectangle {
    double width;
    double height;
    String color;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
