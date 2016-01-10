package _9_2;

import _9_1.ComparableGeometricObject;

/**
 * Created by ht on 2016/1/5.
 */
public class $9_2 {
    public static void main(String[] args) {
        ComparableCylinder9 cylinder1 = new ComparableCylinder9(78, 45);
        ComparableCylinder9 cylinder2 = new ComparableCylinder9(8, 450);
        ComparableCylinder9 cylinder3 = (ComparableCylinder9) ComparableGeometricObject.max(cylinder1, cylinder2);
        System.out.println("the max cylinder is " + cylinder3.toString());

    }
}
