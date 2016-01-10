package _9_4;

/**
 * Created by ht on 2016/1/6.
 */
public class $9_4 {
    public static void main(String[] args) {
        DcHouse dcHouse1 = new DcHouse(1, 1750.50);
        try {
            DcHouse dcHouse2 = (DcHouse)dcHouse1.clone();
            System.out.println(dcHouse1 == dcHouse2);
            System.out.println(dcHouse1.equals(dcHouse2));

            System.out.println(dcHouse1.getWhenBuilt() == dcHouse2.getWhenBuilt());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
