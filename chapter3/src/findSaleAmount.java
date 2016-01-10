/**
 * Created by ht on 2015/11/11.
 */
public class findSaleAmount {
    public static void main(String[] args) {
        final double rateMoney = 25000;
        final double perSaleAmount = 0.01;
        double saleAmount = perSaleAmount;
        double commission = 0;

        do {
            saleAmount += perSaleAmount;
            if (saleAmount >= 10000.01) {
                commission = 5000 * 0.08 + 5000 * 0.10 + (saleAmount - 10000) * 0.12;
            } else if (saleAmount >= 5000.01 && saleAmount <= 10000) {
                commission = 5000 * 0.08 + (saleAmount - 5000) * 0.10;
            } else {
                commission = saleAmount * 0.08;
            }
        } while (commission <= rateMoney);

        System.out.println((int) (commission * 100) / 100.00);
        System.out.println((int) (saleAmount * 100) / 100.00);
    }
}
