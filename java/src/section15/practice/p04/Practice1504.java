package section15.practice.p04;

import java.util.Scanner;

/*

1~10사이 숫자를 입력하세요: 8
DOWN!
1~10사이 숫자를 입력하세요: 6
UP!
1~10사이 숫자를 입력하세요: 7
정답! 3회 만에 맞췄습니다.

 */

public class Practice1504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 0;
        int value = 0;
        int count = 0;

        goal = (int) (Math.random() * 10) + 1;
        System.out.println(goal);

        while(count < 10) {
            System.out.print("1~10이하 숫자를 입력하세요: ");
            value = scanner.nextInt();

            count++;

            if (goal > value) {
                System.out.println("UP");
            } else if (goal < value) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답! " + count + "회 만에 맞췄습니다.");
                break;
            }
        }

        scanner.close();
    }
}
