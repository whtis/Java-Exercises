package _8_2;

import java.util.Date;

/**
 * Created by ht on 2015/12/17.
 */
public class Employee extends Person {
    String office;
    double payment;
    Date date;

    @Override
    public String toString() {
        return Employee.class.getName() + super.getName();
    }

    public String getOffice() {
        return office;
    }

    public double getPayment() {
        return payment;
    }

    public Date getDate() {
        return date;
    }
}
