import javax.swing.*;

/**
 * Created by ht on 2015/12/12.
 */
public class $6_12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("please enter an even: "));
        StackInteger stackInteger = new StackInteger();
        int b = 0;
        //0 1 控制循环的结束
        while (b == 0) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    stackInteger.push(i);
                    num = num / i;
                    b = 0;
                    break;
                } else b = 1;
            }

        }
        //最大的因子放入栈顶
        stackInteger.push(num);

        while (!stackInteger.empty()) {
            System.out.println(stackInteger.pop());
        }
    }
}

