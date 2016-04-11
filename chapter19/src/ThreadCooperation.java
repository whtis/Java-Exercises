/**
 * Created by ht on 2016/4/7.
 */
public class ThreadCooperation {

    private AccountO accountO = new AccountO();
    private Thread thread1 = new DepositThread();
    private Thread thread2 = new WithDrawThread();

    public static void main(String[] args) {
        ThreadCooperation test = new ThreadCooperation();
        System.out.println("Thread 1\t\tThread 2\t\tBalance");
    }

    public ThreadCooperation() {
        thread1.start();
        thread2.start();
    }

    class DepositThread extends Thread {
        @Override
        public void run() {
            while (true) {
                accountO.deposit((int) (Math.random() * 10) + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class WithDrawThread extends Thread {
        @Override
        public void run() {
            while (true) {
                accountO.withdraw((int) (Math.random() * 10) + 1);
            }
        }
    }

    class AccountO {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public synchronized void deposit(int amount) {
            balance += amount;
            System.out.println("Deposit " + amount + "\t\t\t\t\t\t" + accountO.getBalance());
            notifyAll();
        }

        public synchronized void withdraw(int amount) {
            try {
                while (balance < amount) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("\t\t\t\tWithdraw " + amount + "\t\t" + accountO.getBalance());
        }
    }

}

