/**
 * Created by ht on 2016/1/30.
 */
public class test {
    public static void main(String[] args) {
        try {
            int i = 2;
            int y = i / 0;
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println("this is last");
    }
}
