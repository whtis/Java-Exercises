import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/8.
 */
public class TestWindowEvent extends JFrame implements WindowListener {

    public TestWindowEvent() throws HeadlessException {
        addWindowListener(this);
    }

    public static void main(String[] args) {
        TestWindowEvent testWindowEvent = new TestWindowEvent();
        testWindowEvent.setTitle("TestWindowEvent");
        testWindowEvent.setSize(400, 300);
        testWindowEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testWindowEvent.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactived");
    }
}
