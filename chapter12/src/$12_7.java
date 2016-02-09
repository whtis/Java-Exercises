import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_7 extends JFrame implements WindowListener {


    public $12_7() throws HeadlessException {
        this.addWindowListener(this);
    }


    public static void main(String[] args) {
        $12_7 frame = new $12_7();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        PaintPanel p = new PaintPanel(this.getWidth() / 2, this.getHeight() / 2);
        this.getContentPane().add(p);
        p.setFocusable(true);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

class PaintPanel extends JPanel implements KeyListener {

    private int x = 100;
    private int y = 100;
    private Point lineStart = new Point(0,0);


    public PaintPanel(int x, int y) {
        this.x = x;
        this.y = y;
        lineStart.move(x, y);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= 1;
                break;
            case KeyEvent.VK_DOWN:
                y += 1;
                break;
            case KeyEvent.VK_LEFT:
                x -= 1;
                break;
            case KeyEvent.VK_RIGHT:
                x += 1;
                break;
//            default:
//                x = this.getWidth() / 2;
//                y = this.getHeight() / 2;
//                lineStart.move(x,y);
        }
        Graphics g = getGraphics();
        g.setColor(Color.black);
        g.drawLine(lineStart.x, lineStart.y, x, y);
        lineStart.move(x,y);

        g.dispose();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
