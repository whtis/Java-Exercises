import sun.security.action.GetPropertyAction;

import java.io.File;

/**
 * Created by ht on 2016/1/30.
 */
public class test {
   static String lineSeparator = (String) java.security.AccessController.doPrivileged(new sun.security.action.GetPropertyAction("line.separator"));

    public static void main(String[] args) {

        System.out.println(lineSeparator);
    }

}
