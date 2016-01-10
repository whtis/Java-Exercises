/**
 * Created by ht on 2015/12/15.
 */
public class $7_9 {
    public static void main(String[] args) {
//        int num = Integer.parseInt(JOptionPane.showInputDialog("please enter an even: "));
        int num = 9123;
        String str = covertDecimalToBinary(num);
        System.out.println(str);
    }

    private static String covertDecimalToBinary(int num) {
        StringBuffer buffer = new StringBuffer();
        while (num != 0) {
            int a = num % 16;
            switch (a) {
                case 10:
                    buffer.append("A");
                    break;
                case 11:
                    buffer.append("B");
                    break;
                case 12:
                    buffer.append("C");
                    break;
                case 13:
                    buffer.append("D");
                    break;
                case 14:
                    buffer.append("E");
                    break;
                case 15:
                    buffer.append("F");
                    break;
                default:
                    buffer.append(a);
            }
            num = num / 16;
        }
        buffer.reverse();
        return buffer.toString();
    }
}
