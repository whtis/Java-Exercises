/**
 * Created by ht on 2015/12/13.
 */
public class test {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A extends B {
    int i = 5;
    static int j = 4;

    A() {
        System.out.println(i);
        System.out.println(j);
    }

    void m() {
        System.out.println(i);
        System.out.println(j);
    }

}

class B {
    B() {

    }

    void m() {

    }
}
