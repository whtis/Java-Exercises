import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_6 extends JFrame implements KeyListener, MouseListener {

    private MessagePanel messagePanel = new MessagePanel();
    private String message;

    private int x;
    private int y;

    public $12_6() throws HeadlessException {
        this.getContentPane().add(messagePanel);
        messagePanel.addMouseListener(this);
        messagePanel.addKeyListener(this);

        messagePanel.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        message = String.valueOf(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        messagePanel.setMessage(message);
        messagePanel.setxCoordinate(x);
        messagePanel.setyCoordinate(y);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        $12_6 frame = new $12_6();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
