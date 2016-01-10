/**
 * Created by ht on 2015/11/17.
 */
public class $3_10 {
    public static void main(String[] args) {
        String output = "     千克 " +ss("磅")+ss("  ") +ss("磅")+ss(" ")+ss("千克\n"); //3585
        for (int i = 1; i <= 100; i++) {
            output += ss(2 * i - 1).toString() + ss(" ") + ss((220) * (2 * i - 1) / 100.00) + ss("  ") +
                    ss(5 * i + 15).toString() + ss(" ") + ss((int)(((5 * i + 15) * 100)/ 2.2)/100.00) + "\n";
        }
        System.out.print(output);
    }

    static Object ss(Object input) {
        input = String.format("%6s", input);
        return input;
    }
}
