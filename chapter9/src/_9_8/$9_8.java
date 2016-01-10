package _9_8;

import example.Circle9;
import example.Cylinder9;
import example.GeometricObject;
import example.Rectangle;

/**
 * Created by ht on 2016/1/6.
 */
public class $9_8 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[3];
        geometricObjects[0] = new Circle9(3);
        geometricObjects[1] = new Cylinder9(3, 8);
        geometricObjects[2] = new Rectangle(5, 4);
        double totalArea = sumArea(geometricObjects);
        System.out.println("the area is " + totalArea);

    }

    private static double sumArea(GeometricObject[] geometricObjects) {
        double sum = 0;
        for (int i = 0; i < geometricObjects.length; i++) {
            sum += geometricObjects[i].findArea();
        }
        return sum;
    }
}
