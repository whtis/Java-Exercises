import javax.swing.*;

/**
 * Created by ht on 2015/11/25.
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "请输入碟片的数量 :"));
        System.out.println("移动顺序是： ");
        moveDisks(n, 'A', 'B', 'C');
    }

    private static void moveDisks(int n, char fromTower, char ToTower, char auxTower) {
        if (n == 1) {
            System.out.println("move disk " + n + " from " + fromTower + " to " + ToTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, ToTower);
            System.out.println("move disk " + n + " from " + fromTower + " to " + ToTower);
            moveDisks(n - 1, auxTower, ToTower, fromTower);
        }

    }
}
