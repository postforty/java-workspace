package section14.ex04;

import java.util.Scanner;

public class Ex1406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요: ");
        int age = scanner.nextInt();

        try {
            if (age < 19) {
                throw new Exception("미성년자 입니다.");
            } else {
                System.out.println("접근 허가");
            }
        } catch(Exception e) {
            System.out.println("접근 불가: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
