package _10_4;

/**
 * Created by ht on 2016/1/30.
 */
public class Student extends Person {
    private String major;

    public Student(Name name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.major;
    }

    @Override
    public int compareTo(Object o) {
        if (major.compareTo(((Student) o).getMajor()) > 0) {
            return 1;
        } else if (major.compareTo(((Student) o).getMajor()) < 0) {
            return -1;
        } else {
            return super.compareTo(o);
        }
    }
}
