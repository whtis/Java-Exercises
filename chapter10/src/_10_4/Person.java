package _10_4;

/**
 * Created by ht on 2016/1/30.
 */
public class Person implements Comparable {
    Name name;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getName() == ((Person) obj).getName()) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return name.getFullName();
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if (this.name.getLastName().compareTo(p.name.getLastName()) > 0) {
            return 1;
        } else if (this.name.getLastName().compareTo(p.name.getLastName()) < 0) {
            return -1;
        } else {
            if (this.name.getFirstName().compareTo(p.name.getFirstName()) > 0) {
                return 1;
            } else if (this.name.getFirstName().compareTo(p.name.getFirstName()) < 0) {
                return -1;
            } else {
                if (this.name.getMi() > p.name.getMi()) {
                    return 1;
                } else if (this.name.getMi() < p.name.getMi()) {
                    return -1;
                } else return 0;
            }
        }
    }
}
