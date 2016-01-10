import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2015/11/10.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        String output = " Multiplication Table \n";
        output += "-------------------------- \n" + "  |   ";
        for (int i = 1; i <= 9; i++) {
            output += i + "  ";
        }
        output += "\n";
        for (int i = 1; i < 10; i++) {
            output += i +" | ";
            for (int j = 1; j < 10; j++) {
                if (i * j < 10) {
                    output += " " + " "+ i * j;
                } else
                    output += " " + i * j;

            }
            output += "\n";
        }
        System.out.println(output);
        JTextArea jTextArea = new JTextArea();

        //method1:
        jTextArea.setFont(new Font("楷体", Font.PLAIN, 20));//换个字体才能保证宽度
        jTextArea.setBackground(new JOptionPane().getBackground());//颜色有差异
        jTextArea.setText(output);
        JOptionPane.showMessageDialog(null, jTextArea);
//        JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
    }
}
