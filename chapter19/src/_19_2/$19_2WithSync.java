package _19_2;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_2WithSync {
    private EInteger eInteger = new EInteger(0);
    private Thread[] threads = new Thread[100];

    public static void main(String[] args) {
        $19_2WithSync e19_2 = new $19_2WithSync();
        System.out.println("sum is " + e19_2.eInteger.getNum());
    }

    public $19_2WithSync() {
        ThreadGroup g = new ThreadGroup("exercise2");
        for (int i = 0; i < 100; i++) {
            SyncExercise2Thread t = new SyncExercise2Thread(eInteger);
            threads[i] = new Thread(g, t, "t");
            threads[i].start();
        }
    }
}

class SyncExercise2Thread extends Thread {

    private EInteger eInteger;

    public SyncExercise2Thread(EInteger eInteger) {
        this.eInteger = eInteger;
        add();
    }

    public synchronized void add() {
        eInteger.addOne();
    }

}

