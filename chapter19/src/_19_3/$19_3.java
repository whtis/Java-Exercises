package _19_3;

/**
 * Created by ht on 2016/4/10.
 */
public class $19_3 {

    private Account account = new Account();
    private Thread[] threads = new Thread[100];

    public $19_3() {
        ThreadGroup g = new ThreadGroup("group");
        boolean done = false;

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(g, new AddPennyThread(), "t");
            threads[i].start();
        }

        while (!done) {
            if (g.activeCount() == 0) {
                done = true;
            }
        }

    }

    public synchronized void addPenny() {
        account.deposit(1);
    }

    class AddPennyThread extends Thread {
        public void run() {
            addPenny();
        }
    }

    public static void main(String[] args) {
        $19_3 test = new $19_3();
        System.out.println("What is balance ? " + test.account.getBalance());
    }

}

class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        int newBalance = balance + amount;

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
    }
}