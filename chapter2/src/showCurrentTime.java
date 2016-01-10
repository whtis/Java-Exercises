import javax.swing.*;
import javax.swing.plaf.synth.SynthButtonUI;
import java.util.Date;

/**
 * Created by w on 15-11-5.
 */
public class showCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        int seconds = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int minutes = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int hours = (int) (totalHours % 24);
//        JOptionPane.showMessageDialog(null, hours + ":" + minutes + ":" + seconds + " GMT");
        System.out.println(hours + ":" + minutes + ":" + seconds + " GMT");
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date());

    }
}
