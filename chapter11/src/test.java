import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/4.
 */
public class test extends JFrame {

    public test() throws HeadlessException {
        getContentPane().add(new DrawMessage());
    }

    public static void main(String[] args) {
        test testPanes = new test();
        testPanes.setSize(400, 300);
        testPanes.setVisible(true);

        testPanes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class DrawMessage extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Welcome to Java", 20, 20);
    }


}