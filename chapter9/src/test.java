import java.util.Comparator;
import java.util.Date;

/**
 * Created by ht on 2015/12/17.
 */
public class test {
    public static void main(String[] args) {
        House House1 = new House(1, 1750.50);
        try {
            House House2 = (House) House1.clone();
            System.out.println(House1 == House2);
            System.out.println(House1.getWhenBuilt() == House2.getWhenBuilt());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
