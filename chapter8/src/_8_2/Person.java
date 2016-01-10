package _8_2;

/**
 * Created by ht on 2015/12/17.
 */
public class Person {
    String name;
    String address;
    String tel;
    String email;

    @Override
    public String toString() {
        return Person.class.getName() + this.getName();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
}
