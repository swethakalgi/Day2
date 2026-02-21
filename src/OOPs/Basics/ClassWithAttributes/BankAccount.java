package OOPs.Basics.ClassWithAttributes;

public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
       balance  += amount;
       System.out.println("Amount Deposited" + amount);
       System.out.println("Updated Balance" + balance);
    }

    void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn" + amount);
            System.out.println("Updated Balance" + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance(){
        System.out.println("Account Holder:" + accountHolder);
        System.out.println("Current Balance" + balance);
    }

    static void main(String[] args) {
        BankAccount account = new BankAccount("Swetha", 10000);
        account.deposit(2000);
        account.withdraw(5000);
        account.displayBalance();
    }
}
