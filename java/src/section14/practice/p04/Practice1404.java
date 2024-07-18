package section14.practice.p04;

import java.util.Scanner;

public class Practice1404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("정상적인 처리:" + age);
        } catch(Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkAge(int age) throws Exception {
        if(age < 0) {
            throw new Exception("음수 나이는 입력할 수 없습니다.");
        }
    }
}
