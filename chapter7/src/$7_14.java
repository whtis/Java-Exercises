import javax.swing.*;
import java.util.StringTokenizer;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_14 {
    public static void main(String[] args) {
//        String str = JOptionPane.showInputDialog("please enter a string: ");
        String str = "I am a boy,but i love boys";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            System.out.println(tokenizer.countTokens());
        }
    }
}
