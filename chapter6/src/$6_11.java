/**
 * Created by ht on 2015/12/12.
 */
public class $6_11 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(-1, -9);
        MyPoint p2 = new MyPoint(2, 2);
        System.out.println(MyPoint.distance(p1, p2));
    }
}

class MyPoint {
    double x;
    double y;

    public MyPoint() {

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt((secondPoint.x - x) * (secondPoint.x - x) + (secondPoint.y - y) * (secondPoint.y - y));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}