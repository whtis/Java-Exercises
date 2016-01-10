package util_chapter2;

import javax.swing.*;

/**
 * Created by w on 15-11-8.
 */
public class showInPane {

    public static Object Input(Object object) {
        return  JOptionPane.showInputDialog(null, object);
    }

    public static void outPut(Object object) {
        JOptionPane.showMessageDialog(null, object);
    }

    public static void prt(Object object) {
        System.out.println(object);
    }
}
