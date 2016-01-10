package _9_1;

import example.Cylinder9;

/**
 * Created by ht on 2016/1/5.
 */
public class $9_1 {
    public static void main(String[] args) {
        ComparableGeometricObject circle1 = new ComparableCircle9(5);
        ComparableGeometricObject circle2 = new ComparableCircle9(9);
        ComparableCircle9 circle3 = (ComparableCircle9) ComparableGeometricObject.max(circle1, circle2);
        //使用重写的toString()方法
        System.out.println("the max is " + circle3);

        Cylinder9 cylinder1 = new Cylinder9(67, 98);
        Cylinder9 cylinder2 = new Cylinder9(21, 48);
        Cylinder9 cylinder3 = (Cylinder9) ComparableGeometricObject.max(cylinder1, cylinder2);
        //使用重写的toString()方法
        System.out.println("the max is " + cylinder3);

    }
}
