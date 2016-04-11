package _19_7;

import java.util.*;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_7 {
    private HashSet hashSet = new HashSet();

    public $19_7() {
        FillThread fillThread = new FillThread();
        Thread iteratorThread = new Thread(new IteratorThread());
        fillThread.start();
        iteratorThread.start();
    }

    public static void main(String[] args) {
        $19_7 test = new $19_7();
    }

    class FillThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                synchronized (hashSet) {
                    hashSet.add(((int) (Math.random() * 10)) + 1);
                }
                try {
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
            Collections.synchronizedSet(hashSet);
            while (true) {
                System.out.println(Thread.currentThread().getName());
                synchronized (hashSet) {
                    Iterator iterator = hashSet.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
