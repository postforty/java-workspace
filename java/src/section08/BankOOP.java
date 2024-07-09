package section08;

class BankAccount {
    int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("잔액 : " + balance);
    }
}

public class BankOOP {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();

        System.out.println();

        BankAccount account2 = new BankAccount();
        account2.deposit(10000);
        account2.printBalance();
        account2.deposit(5000);
        account2.printBalance();

        System.out.println();

        BankAccount account3 = new BankAccount();
        account3.deposit(0);
        account3.printBalance();
        account3.deposit(100);
        account3.printBalance();

        System.out.println();

        BankAccount acc4 = new BankAccount();
        acc4.deposit(0);
        acc4.printBalance();
        acc4.deposit(500);
        acc4.printBalance();

    }
}
