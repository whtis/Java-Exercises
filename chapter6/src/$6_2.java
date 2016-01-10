/**
 * Created by ht on 2015/12/12.
 */
public class $6_2 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        System.out.println("$" + account.getBalance());
        account.deposit(3000);
        System.out.println("$" + account.getBalance());
        System.out.println(account.getMonthlyInterestRate() * 100 + "%");
        System.out.println("------------------");
        //another method
        Account account2 = new Account();
        account2.setId(1122);
        account2.setAnnualInterestRate(4.5);
        account2.setBalance(20000);
        account2.withdraw(2500);
        System.out.println("$" + account2.getBalance());
        account2.deposit(3000);
        System.out.println("$" + account2.getBalance());
        System.out.println(account2.getMonthlyInterestRate() * 100 + "%");

    }
}

class Account {
    int id;
    double balance;
    double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }
}