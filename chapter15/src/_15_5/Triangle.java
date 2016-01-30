package _15_5;

/**
 * Created by ht on 2016/1/30.
 */

    public class Triangle extends Object {
        private double side1, side2, side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double findArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        }

        public double findPerimeter() {
            return side3 + side2 + side1;
        }

        public String toString() {
            return side1 + " " + side2 + " " + side3;
        }
    }
