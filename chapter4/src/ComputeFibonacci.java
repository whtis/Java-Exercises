import javax.swing.*;

/**
 * Created by ht on 2015/11/24.
 */
public class ComputeFibonacci {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "请输入截止位置： ");
        int index = Integer.parseInt(str);
        System.out.println(fib(index));
    }

    static long fib(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }


}
