package zujian;

import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

/**
 * Created by ht on 2016/2/11.
 */
public class TestButtonIcons extends JFrame {

    public TestButtonIcons() throws HeadlessException {
        ImageIcon imageIcon1 = new ImageIcon("image/libing.png");
        ImageIcon imageIcon2 = new ImageIcon("image/zhangziyi.png");
        ImageIcon imageIcon3 = new ImageIcon("image/zhaowei.png");

        JButton jButton = new JButton("click here", imageIcon1);
        jButton.setPressedIcon(imageIcon2);
        jButton.setRolloverIcon(imageIcon3);
        jButton.setBorder(new MetalBorders.ButtonBorder());
        this.getContentPane().add(jButton);
    }

    public static void main(String[] args) {
        TestButtonIcons frame = new TestButtonIcons();
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
