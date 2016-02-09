import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class AnimationDemo extends JFrame {
    public AnimationDemo() {
        MovingMessagePanel movingMessagePanel = new MovingMessagePanel("is whtis Moving?");
        this.getContentPane().add(movingMessagePanel);

        //Create a timer for the listener p
        Timer timer = new Timer(3000, movingMessagePanel);
        timer.start();
    }

    public static void main(String[] args) {
        AnimationDemo animationDemo = new AnimationDemo();
        animationDemo.setSize(800, 600);
        animationDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        animationDemo.setVisible(true);
    }
}


class MovingMessagePanel extends JPanel implements ActionListener {

    private String message = "Welcome to Java";
    private int xCoordinate = 20;
    private int yCoordinate = 20;

    public MovingMessagePanel(String s) {
        this.message = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (xCoordinate > getWidth()) {
            xCoordinate = -30;
            yCoordinate = 20;
        }

        xCoordinate += 5;
        yCoordinate += 3;
        g.drawString(message, xCoordinate, yCoordinate);
    }
}