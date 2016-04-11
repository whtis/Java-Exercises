package _19_2;

/**
 * Created by ht on 2016/4/7.
 */
public class $19_2WithoutSync {

    private EInteger eInteger = new EInteger(0);
    private Thread[] threads = new Thread[100];

    public static void main(String[] args) {
        $19_2WithoutSync e19 = new $19_2WithoutSync();
        System.out.println("sum is " + e19.eInteger.getNum());
    }

    public $19_2WithoutSync() {
        ThreadGroup g = new ThreadGroup("exercise2");
        boolean done = false;
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(g, new Exercise2Thread(eInteger), "t");
            threads[i].start();
        }

        while (!done) {
            if (g.activeCount() == 0) {
                done = true;
            }
        }
    }
}

class Exercise2Thread extends Thread {


    private EInteger eInteger;

    public  Exercise2Thread(EInteger eInteger) {
        this.eInteger = eInteger;
        add();
    }

    public void add() {
        eInteger.addOne();
    }

}

class EInteger {
    private Integer num;

    public EInteger(Integer num) {
        this.num = num;
    }

    public void addOne() {
        num += 1;
    }

    public Integer getNum() {
        return num;
    }
}
