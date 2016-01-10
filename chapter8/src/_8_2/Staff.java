package _8_2;

/**
 * Created by ht on 2015/12/17.
 */
public class Staff extends Employee {
    String jobName;


    @Override
    public String toString() {
        return Staff.class.getName() + super.getName();
    }

    public String getJobName() {
        return jobName;
    }
}
