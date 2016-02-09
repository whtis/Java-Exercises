import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_4 extends JFrame implements MouseListener{

    private MessagePanel messagePanel = new MessagePanel();

    public $12_4() throws HeadlessException {
        this.getContentPane().add(messagePanel);
        messagePanel.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        messagePanel.setMessage("(" + x + "," + y + ")");
        messagePanel.setxCoordinate(x);
        messagePanel.setyCoordinate(y);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

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
        $12_4 frame = new $12_4();
        frame.setTitle("$12_4");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
