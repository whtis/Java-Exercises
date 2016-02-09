import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/8.
 */
public class $11_4 extends JFrame {
    public static void main(String[] args) {
        $11_4 ss = new $11_4();
        ss.setLayout(new GridLayout(2, 1));
        MyJPanel p1 = new MyJPanel();
        MyJPanel p2 = new MyJPanel();
        ss.add(p1);
        ss.add(p2);
        ss.setSize(300, 200);
        ss.setLocation(400, 300);
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MyJPanel extends JPanel {
    public MyJPanel() {
        this.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            this.add(new JButton("Button" + i));
        }
    }
}