package section06;

import java.util.Scanner;

public class Ex0618 {
  public static void main(String[] args) {
    int[][] lotto = {
      {1,2,3,4,5,6},
      {7,8,9,10,11,12}
    };

    Scanner scan = new Scanner(System.in);
    String number = "";

    System.out.print("당첨 숫자 6개를 연속으로 입력해주세요 >>> ");
    number = scan.next();
    boolean isFail = true;

    for(int i = 0; i < lotto.length; i++) {
      // 1. 다차원 배열의 요소를 문자열로 만들기
      String lottoNumber = "";

      for (int j=0; j < lotto[i].length; j++) {
        lottoNumber += lotto[i][j];
      }

      // System.out.println(lottoNumber);

      // 2. equals() 메서드 사용하여 문자열 객체의 값을 비교
      if (number.equals(lottoNumber)) {
        System.out.println(number + " 당첨입니다.");
        isFail = false;
        break;
      }
    }

    if (isFail) {
      System.out.println("당첨되지 않았습니다.");
    }

    scan.close();
  }
}
