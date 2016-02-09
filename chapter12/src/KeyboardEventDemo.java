import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class KeyboardEventDemo extends JFrame {

    private KeyboardPanel keyboardPanel = new KeyboardPanel();

    public KeyboardEventDemo() {
        this.getContentPane().add(keyboardPanel);
        keyboardPanel.setFocusable(true);
    }

    public static void main(String[] args) {
        KeyboardEventDemo keyboardEventDemo = new KeyboardEventDemo();
        keyboardEventDemo.setSize(400, 300);
        keyboardEventDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyboardEventDemo.setVisible(true);
    }

}

class KeyboardPanel extends JPanel implements KeyListener {

    private int x = 100;
    private int y = 100;
    private char keyChar = 'A';

    public KeyboardPanel() {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            default:
                keyChar = e.getKeyChar();
        }
        repaint();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.drawString(String.valueOf(keyChar),x,y);
    }
}