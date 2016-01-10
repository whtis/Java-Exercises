import javax.swing.*;
import java.util.Scanner;

/**
 * Created by ht on 2015/11/26.
 */
public class $4_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the Triangle's sides:(use space to spilt) ");
        String str = s.nextLine();
        JOptionPane.showMessageDialog(null, "b");
        String[] string = str.split(" ");
        boolean b;
        double area = 0;
        if (string.length != 3) {
            System.out.println("error");
        } else {
            b = MyTriangle.isValid(changeDouble(string[0]), changeDouble(string[1]), changeDouble(string[2]));
            JOptionPane.showMessageDialog(null, b);
//            System.out.println("is a Triangle? " + b);

            if (b) {
                area = MyTriangle.area(changeDouble(string[0]), changeDouble(string[1]), changeDouble(string[2]));
//                System.out.printf("%3f", area);
                JOptionPane.showMessageDialog(null, area);
            }
        }


    }

    static double changeDouble(String s) {
        double d = Double.parseDouble(s);
        return d;
    }

}
