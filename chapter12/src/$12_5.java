import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_5 extends JFrame implements MouseListener {

//    private MessagePanel p = new MessagePanel();//MessagePanel 设置背景色不起作用
    private MyJPanel p = new MyJPanel();

    public $12_5() throws HeadlessException {
        this.getContentPane().add(p);
        p.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        p.setBackground(Color.black);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        p.setBackground(Color.WHITE);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        $12_5 frame = new $12_5();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyJPanel extends JPanel {
    public MyJPanel() {
        this.setBackground(Color.cyan);
    }
}