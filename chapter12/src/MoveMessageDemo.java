import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class MoveMessageDemo extends JFrame {

    public MoveMessageDemo() throws HeadlessException {
        MoveMessagePanel m = new MoveMessagePanel("Welcome to Java");
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(m, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MoveMessageDemo moveMessageDemo = new MoveMessageDemo();
        moveMessageDemo.setSize(400, 300);
        moveMessageDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        moveMessageDemo.setVisible(true);
    }

}

class MoveMessagePanel extends MessagePanel implements MouseMotionListener {

    public MoveMessagePanel(String message) throws HeadlessException {
        super(message);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        setxCoordinate(e.getX());
        setyCoordinate(e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}