package _10_4;

/**
 * Created by ht on 2016/1/29.
 */
public class Name {
    private String firstName;
    private char mi;
    private String lastName;

    public Name(String firstName, char mi, String lastName) {
        this.firstName = firstName;
        this.mi = mi;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMi() {
        return mi;
    }

    public void setMi(char mi) {
        this.mi = mi;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + "·" + mi + "·" + lastName;
    }
}

