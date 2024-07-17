package section13.ex05_lambda.anonymus_inner;

interface Calculator {
    int calculator(int a, int b);
}

public class Ex1305 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        Calculator add = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a + b;
            }
        };

        System.out.println("add: " + add.calculator(num1, num2));

        Calculator sub = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a - b;
            }
        };

        System.out.println("sub: " + sub.calculator(num1, num2));

        Calculator mul = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a * b;
            }
        };

        System.out.println("mul: " + mul.calculator(num1, num2));

        Calculator div = new Calculator() {
            @Override
            public int calculator(int a, int b) {
                return a / b;
            }
        };

        System.out.println("div: " + div.calculator(num1, num2));
    }
}
