/**
 * Created by ht on 2015/12/9.
 */
public class TestStackInteger {
    public static void main(String[] args) {
        StackInteger stack = new StackInteger();

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
