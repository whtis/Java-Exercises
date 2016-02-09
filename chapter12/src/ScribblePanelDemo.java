import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class ScribblePanelDemo extends JFrame {

    public ScribblePanelDemo() throws HeadlessException {
        getContentPane().add(new ScribblePanel());
    }

    public static void main(String[] args) {
        ScribblePanelDemo scribblePanelDemo = new ScribblePanelDemo();
        scribblePanelDemo.setSize(400, 300);
        scribblePanelDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scribblePanelDemo.setVisible(true);

    }
}

class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {

    final int CIRCLESIZE = 20;
    private Point lineStart = new Point(0, 0);
    private Graphics g;

    public ScribblePanel() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        lineStart.move(e.getX(), e.getY());
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

    @Override
    public void mouseDragged(MouseEvent e) {
        g = getGraphics();
        //Erase the drawing using an oval
        if (e.isMetaDown()) {
            g.setColor(getBackground());
            g.fillOval(e.getX() - (CIRCLESIZE / 2), e.getY() - (CIRCLESIZE / 2), CIRCLESIZE, CIRCLESIZE);
        } else {
            g.setColor(Color.BLACK);
            g.drawLine(lineStart.x, lineStart.y, e.getX(), e.getY());
        }

        lineStart.move(e.getX(), e.getY());

        g.dispose();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}