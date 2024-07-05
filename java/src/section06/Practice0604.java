package section06;

import java.util.Scanner;

public class Practice0604 {
    public static void main(String[] args) {
        /*
         * 출력할 구구단의 단을 입력하세요: 5
         * 5 x 1 = 5
         * 5 x 2 = 10
         * 5 x 3 = 15
         * 5 x 4 = 20
         * 5 x 5 = 25
         * 5 x 6 = 30
         * 5 x 7 = 35
         * 5 x 8 = 40
         * 5 x 9 = 45
         */

        int dan;

        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단의 단을 입력하세요: ");

        dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d × %d = %d\n", dan, i, dan * i);
        }

        scanner.close();

    }
}
