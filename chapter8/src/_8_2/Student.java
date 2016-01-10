package _8_2;

/**
 * Created by ht on 2015/12/17.
 */
public class Student extends Person {
    public static String status1 = "grade one";
    public static String status2 = "grade two";
    public static String status3 = "grade three";
    public static String status4 = "grade four";

    @Override
    public String toString() {
        return Student.class.getName() + super.getName();
    }

    public static String getStatus1() {
        return status1;
    }

    public static String getStatus2() {
        return status2;
    }

    public static String getStatus3() {
        return status3;
    }

    public static String getStatus4() {
        return status4;
    }
}
