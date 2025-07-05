package section06.practice;

import java.util.Arrays;

public class Practice0603 {
  public static void main(String[] args) {
    int[] cards = new int[10];

    for(int i = 0; i < cards.length; i++) {
      cards[i] = (int)(Math.random() * 10) + 1;

      // cards 배열에 중복이 있는지 확인
      // 중복이 있다면 i-- 적용하여 10번 코드 다시 진행
      for(int j = 0; j < i; j++) {
        if (cards[j] == cards[i]) {
          i--;
          break;
        }
      }
    }

    System.out.println(Arrays.toString(cards));
  }
}
