package _19_8;

import java.util.Stack;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_8 {

    private Stack stack = new Stack();

    public $19_8() {
        produceThread p = new produceThread();
        Thread c = new Thread(new consumerThread());
        p.start();
        c.start();
    }

    public synchronized void addOne() {
        stack.push((int) (Math.random() * 10) + 1);
        notifyAll();
    }

    public synchronized Object removeOne() throws InterruptedException {
        if (stack.size() == 0) {
            wait();
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        $19_8 test = new $19_8();
    }

    class produceThread extends Thread {
        @Override
        public void run() {
            System.out.println("Current producerThread is " + Thread.currentThread().getName());
            while (true) {
                addOne();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class consumerThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Current consumerThread is " + Thread.currentThread().getName());
            while (true) {
                try {
                    System.out.print(" " + removeOne());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
