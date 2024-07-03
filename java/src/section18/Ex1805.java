package section18;

import java.util.Scanner;

public class Ex1805 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 개의 정수를 입력하세요(스페이스로 구분): ");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();

        System.out.println("intNum1\t: " + intNum1);
        System.out.println("intNum2\t: " + intNum2);
        System.out.println("intNum3\t: " + intNum3);
        System.out.println("합\t: " + (intNum1 + intNum2 + intNum3));

        scanner.close();
    }
}
