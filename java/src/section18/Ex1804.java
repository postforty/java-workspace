package section18;

import java.util.Scanner;

public class Ex1804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int intNum1 = scanner.nextInt();

        System.out.println("intNum1 : " + intNum1);
        
        scanner.close();
    }
}
