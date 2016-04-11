package _19_6;

import java.util.*;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_6 {
    private HashSet hashSet = new HashSet();

    public $19_6() {
        FillThread fillThread = new FillThread();
        Thread iteratorThread = new Thread(new IteratorThread());
        fillThread.start();
        iteratorThread.start();
    }

    public static void main(String[] args) {
        $19_6 test = new $19_6();
    }

    class FillThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    hashSet.add((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class IteratorThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                Iterator iterator = hashSet.iterator();
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(iterator.next());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
