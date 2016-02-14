package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/12.
 */
public class ScrollBarDemo extends JFrame implements AdjustmentListener {

    private JScrollBar hScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
    private JScrollBar vScrollBar = new JScrollBar(JScrollBar.VERTICAL);

    private MessagePanel messagePanel = new MessagePanel("hello whtis");

    public ScrollBarDemo() throws HeadlessException {
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(vScrollBar, BorderLayout.EAST);
        this.getContentPane().add(hScrollBar, BorderLayout.SOUTH);

        vScrollBar.addAdjustmentListener(this);
        hScrollBar.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == hScrollBar) {
            double value = hScrollBar.getValue();
            double maximumValue = hScrollBar.getMaximum();
            double newX = (value * messagePanel.getWidth() / maximumValue);
            messagePanel.setxCoordinate((int)newX);
        } else if (e.getSource() == vScrollBar) {
            double value = vScrollBar.getValue();
            double maximumValue = vScrollBar.getMaximum();
            double newY = (value * messagePanel.getHeight() / maximumValue);
            messagePanel.setyCoordinate((int) newY);
        }
    }

    public static void main(String[] args) {
        ScrollBarDemo frame = new ScrollBarDemo();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
