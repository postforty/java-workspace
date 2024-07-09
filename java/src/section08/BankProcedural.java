package section08;

public class BankProcedural {

    static int balance1 = 0;

    public static void deposit1(int amount) {
        balance1 += amount;
    }

    public static void withdraw1(int amount) {
        balance1 -= amount;
    }

    public static void printBalance1() {
        System.out.println("잔액 : " + balance1);
    }

    static int balance2 = 0;

    public static void deposit2(int amount) {
        balance2 += amount;
    }

    public static void withdraw2(int amount) {
        balance2 -= amount;
    }

    public static void printBalance2() {
        System.out.println("잔액 : " + balance2);
    }

    public static void main(String[] args) {
        deposit1(1000);
        deposit1(1000);
        deposit2(1000);


        printBalance1();
        printBalance2();

        withdraw1(500);

        printBalance1();

    }
}
