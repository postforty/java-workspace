package section14.ex04;

import java.util.Scanner;

public class Ex1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            checkAge1(age);
            checkAge2(age);
        } catch (Exception e) {
            System.out.println("접근 불가: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkAge(int age) throws Exception {
        if (age < 19) {
            throw new Exception("미성년자 입니다.");
        } else {
            System.out.println("접근 허가");
        }
    }
    static void checkAge1(int age) throws Exception {
        if (age < 19) {
            throw new Exception("미성년자 입니다.");
        } else {
            System.out.println("접근 허가");
        }
    }
    static void checkAge2(int age) throws Exception {
        if (age < 19) {
            throw new Exception("미성년자 입니다.");
        } else {
            System.out.println("접근 허가");
        }
    }
}
