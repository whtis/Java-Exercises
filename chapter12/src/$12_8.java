import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/9.
 */
public class $12_8 extends JFrame {

    public $12_8() throws HeadlessException {
        BlinkPanel p1 = new BlinkPanel(false, "whtis");
        this.getContentPane().add(p1);
        Timer timer = new Timer(1000, p1);
        timer.start();
    }

    public static void main(String[] args) {
        $12_8 frame = new $12_8();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

class BlinkPanel extends JPanel implements ActionListener {

    private String message;

    private boolean isBlinked;

    public BlinkPanel() {

    }

    public BlinkPanel(boolean isBlinked, String message) {
        this.isBlinked = isBlinked;
        this.message = message;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isBlinked) {
            g.setColor(Color.BLACK);
            g.drawString(message, this.getWidth() / 2, this.getHeight() / 2);
            isBlinked = false;
        }
        else {
            isBlinked = true;
        }
    }
}