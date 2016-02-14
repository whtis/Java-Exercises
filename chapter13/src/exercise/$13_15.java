package exercise;

import zujian.MessagePanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/14.
 */
public class $13_15 extends JFrame implements AdjustmentListener{

    private JScrollBar jsb1 = new JScrollBar(JSlider.HORIZONTAL);
    private JScrollBar jsb2 = new JScrollBar(JSlider.HORIZONTAL);
    private JScrollBar jsb3 = new JScrollBar(JSlider.HORIZONTAL);

    private JLabel jlb1 = new JLabel("Red");
    private JLabel jlb2 = new JLabel("Green");
    private JLabel jlb3 = new JLabel("Blue");

    private int rColor;
    private int gColor;
    private int bColor;

    private MessagePanel messagePanel = new MessagePanel("Hello whtis");

    public static void main(String[] args) {
        $13_15 frame = new $13_15();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public $13_15() throws HeadlessException {
        JPanel p = new JPanel(new GridLayout(0, 2));
        p.add(jlb1);
        p.add(jsb1);
        p.add(jlb2);
        p.add(jsb2);
        p.add(jlb3);
        p.add(jsb3);
        p.setBorder(new TitledBorder("Choose colors"));

        jsb1.setMaximum(255);
        jsb2.setMaximum(255);
        jsb3.setMaximum(255);
        jsb1.setMinimum(0);
        jsb2.setMinimum(0);
        jsb3.setMinimum(0);

        rColor = jsb1.getValue();
        gColor = jsb2.getValue();
        bColor = jsb3.getValue();

        jsb1.addAdjustmentListener(this);
        jsb2.addAdjustmentListener(this);
        jsb3.addAdjustmentListener(this);

        this.setLayout(new BorderLayout(5, 5));
        this.getContentPane().add(p, BorderLayout.SOUTH);
        this.getContentPane().add(messagePanel, BorderLayout.CENTER);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == jsb1) {
            rColor = jsb1.getValue();
            messagePanel.setForeground(new Color(rColor, gColor, bColor));
        } else if (e.getSource() == jsb2) {
            gColor = jsb2.getValue();
            messagePanel.setForeground(new Color(rColor,gColor,bColor));
        } else if (e.getSource() == jsb3) {
            bColor = jsb3.getValue();
            messagePanel.setForeground(new Color(rColor,gColor,bColor));
        }
    }
}
