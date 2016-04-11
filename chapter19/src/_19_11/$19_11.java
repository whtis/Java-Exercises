package _19_11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/4/11.
 */
public class $19_11 extends JFrame {

    private JProgressBar jpb;

    public $19_11() throws HeadlessException {
        jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        Thread t = new Thread(new SetValueThread());
        this.getContentPane().add(jpb);
        t.start();

    }

    public static void main(String[] args) {
        $19_11 frame = new $19_11();
        frame.setSize(200, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class SetValueThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                jpb.setValue((int) (Math.random() * 100) + 1);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
