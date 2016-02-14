package zujian;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/12.
 */
public class SliderDemo extends JFrame implements ChangeListener {

    private JSlider hSlider = new JSlider(JSlider.HORIZONTAL);
    private JSlider vSlider = new JSlider(JSlider.VERTICAL);

    private MessagePanel messagePanel = new MessagePanel("hello whtis");

    public SliderDemo() throws HeadlessException {
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
        this.getContentPane().add(vSlider, BorderLayout.EAST);
        this.getContentPane().add(hSlider, BorderLayout.SOUTH);

        vSlider.setPaintLabels(true);
        hSlider.setPaintTicks(true);
        hSlider.setMajorTickSpacing(10);
        hSlider.setMinorTickSpacing(1);
        hSlider.setPaintTrack(false);
        hSlider.setInverted(true);

        vSlider.addChangeListener(this);
        hSlider.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == hSlider) {
            double value = hSlider.getValue();
            double maximumValue = hSlider.getMaximum();
            double newX = (value * messagePanel.getWidth() / maximumValue);
            messagePanel.setxCoordinate((int)newX);
        } else if (e.getSource() == vSlider) {
            double value = vSlider.getValue();
            double maximumValue = vSlider.getMaximum();
            double newY = (value * messagePanel.getHeight() / maximumValue);
            messagePanel.setyCoordinate((int)newY);
        }
    }

    public static void main(String[] args) {
        SliderDemo frame = new SliderDemo();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
