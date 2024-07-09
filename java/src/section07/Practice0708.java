package section07;

import java.util.Scanner;

public class Practice0708 {
    public static void main(String[] args) {

        /*
         * 검색할 값을 입력하세요: 2
         * 값 2이(가) 행 0 열 1에서 발견되었습니다.
         */

        Scanner scanner = new Scanner(System.in);
        int target;
        
        int[][] arrs = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        System.out.print("검색할 값을 입력하세요: ");
        target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < arrs.length; i++ ){
            for (int j = 0; j < arrs[i].length; j++) {
                if(target == arrs[i][j]) {
                    System.out.printf("값 %d이(가) 행 %d 열 %d에서 발견되었습니다.\n", target, i, j);
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }

        if(!found) {
            System.out.println("값 " + target + "을(를) 배열에서 찾을 수 없습니다.");
        }

        scanner.close();
    }
}
