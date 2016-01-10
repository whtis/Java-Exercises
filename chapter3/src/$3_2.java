import javax.swing.*;

/**
 * Created by ht on 2015/11/12.
 */
public class $3_2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入一个整数："));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入一个整数："));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入一个整数："));
        method1(a, b, c);
        method2(a, b, c);
        method3(a, b, c);
    }

    private static void method3(int a, int b, int c) {
        int tmp = 0;
        boolean b1 = a >= b;
        boolean b2 = a >= c;
        boolean b3 = b >= c;
        if (b1 && b2 && b3) {//b3多余 c<=b<=a
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b1 && b2 && !b3) { //b<=c<=a
            tmp = a;
            a = b;
            b = c;
            c = tmp;
        }
        if (b1 && !b2 && !b3) { //b<=a<=c
            tmp = b;
            b = a;
            a = tmp;
        }
        if (!b1 && b2 && b3) { //c<=a<=b
            tmp = c;
            c = b;
            b = a;
            a = tmp;
        }
        if (!b1 && !b2 && b3) { //a<=c<=b
            tmp = b;
            b = c;
            c = tmp;
        }
        if (!b1 && !b2 && !b3) { //a<=b<=c

        }
        System.out.println("the order is " + a + " " + b + " " + c);
    }

    private static void method2(int a, int b, int c) {
        int tmp = 0;
        if (a >= b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b >= c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if (a >= b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println("the order is " + a + " " + b + " " + c);

    }

    private static void method1(int a, int b, int c) {
        int tmp;
        if (a >= b) {
            if (b >= c) {
                //c<=b<=a
                tmp = a;
                a = c;
                c = tmp;
            } else {
                if (a >= c) {
                    //b<=c<=a
                    tmp = a;
                    a = b;
                    b = c;
                    c = tmp;
                } else {
                    //b<=a<=c
                    tmp = b;
                    b = a;
                    a = tmp;
                }
            }
        } else {
            if (b >= c) {
                if (a <= c) {
                    //a<=c<=b
                    tmp = c;
                    c = b;
                    b = tmp;
                } else {
                    //c<=a<=b
                    tmp = b;
                    b = a;
                    a = c;
                    c = tmp;
                }
            }
        }
        System.out.println("the order is " + a + " " + b + " " + c);

    }
}
