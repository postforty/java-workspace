package section04;

import java.util.Scanner;

public class Practice0403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학점을 입력하시오: ");

        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("90점 이상 A학점");
        } else if (score >= 80) {
            System.out.println("80점 이상 B학점");
        } else if (score >= 70) {
            System.out.println("70점 이상 C학점");
        } else if (score >= 60) {
            System.out.println("60점 이상 D학점");
        } else {
            System.out.println("60점 미만 F학점");
        }

        char result = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';

        switch (result) {
            case 'A':
                System.out.println("A학점");
                break;
            case 'B':
                System.out.println("B학점");
                break;
            case 'C':
                System.out.println("C학점");
                break;
            case 'D':
                System.out.println("D학점");
                break;
            case 'F':
                System.out.println("F학점");
                break;
        }

        scanner.close();
    }
}
