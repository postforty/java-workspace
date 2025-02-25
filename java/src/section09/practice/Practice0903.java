package section09.practice;

class BankAccount {
    String accountHolder;
    int balance;

    BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

class SwapBalance {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("SwapBalance : a = %d, b = %d\n", a, b);
    }
}

class SwapAccounts {
    void swap(BankAccount a, BankAccount b) {
        int temp = a.balance;
        a.balance = b.balance;
        b.balance = temp;
        System.out.printf("SwapBalance : %s = %d, %s = %d\n", a.accountHolder, a.balance, b.accountHolder, b.balance);
    }
}

public class Practice0903 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("김일남", 10000);
        BankAccount account2 = new BankAccount("김이남", 5000);
        SwapBalance sb = new SwapBalance();
        SwapAccounts sa = new SwapAccounts();

        System.out.printf("swap() 호출전: %s=%d, %s=%d\n", account1.accountHolder, account1.balance,
                account2.accountHolder, account2.balance);

        sb.swap(account1.balance, account2.balance);

        System.out.printf("swap() 호출후: %s=%d, %s=%d\n", account1.accountHolder, account1.balance,
                account2.accountHolder, account2.balance);

        System.out.println();

        System.out.printf("swap() 호출전: %s=%d, %s=%d\n", account1.accountHolder, account1.balance,
                account2.accountHolder, account2.balance);

        sa.swap(account1, account2);

        System.out.printf("swap() 호출후: %s=%d, %s=%d\n", account1.accountHolder, account1.balance,
                account2.accountHolder, account2.balance);
    }
}
