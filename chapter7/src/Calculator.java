/**
 * Created by ht on 2015/12/14.
 */
public class Calculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            // * 是通配符，因此输入时需这样写"*"
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:

        }
        int sum = a + b;
        System.out.println(a + args[1] + b + "=" + result);
    }
}
