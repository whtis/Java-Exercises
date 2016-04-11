package _19_9;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_9 {

    public static void main(String[] args) {
        DeadThread t1 = new DeadThread();
        DeadThread t2 = new DeadThread();
        t1.flag = 0;
        t2.flag = 1;
        t1.start();
        t2.start();
    }
}

/**
 * 线程1锁定o1后休眠1s，使得有机会执行线程2，线程2锁定o2后，等待线程1释放o1，线程1此时锁定了o1，等待线程2
 * 释放o2，形成死锁。
 *
 */

class DeadThread extends Thread {
    int flag = 0;

    static Object o1 = new Object(), o2 = new Object();

    @Override
    public void run() {
        if (flag==0) {
            System.out.println("flag=" + flag);
            synchronized (o1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("o2 locked");
                }
            }
        }
        if (flag==1) {
            System.out.println("flag=" + flag);
            synchronized (o2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("o2 locked");
                }
            }
        }
    }
}