/**
 * Created by ht on 2015/11/27.
 */

import javax.swing.*;

/**
 * Created by ht on 2015/11/25.
 */
public class $4_21 {

    static int times = 0;

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入碟片的数量 :"));
        System.out.println("移动顺序是： ");

        System.out.println("移动总次数是： " + times);
    }

    private static void moveDisks(int n, char fromTower, char ToTower, char auxTower) {
        times++;
        if (n == 1) {
            System.out.println("move disk " + n + " from " + fromTower + " to " + ToTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, ToTower);
            System.out.println("move disk " + n + " from " + fromTower + " to " + ToTower);
            moveDisks(n - 1, auxTower, ToTower, fromTower);
        }

    }
}

