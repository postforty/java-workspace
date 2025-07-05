package section06;

public class Ex0606 {
  public static void main(String[] args) {
    char[] cards = {'1', 'L', '2', 'O', '3', 'V', '4', 'E'};

    for (int i = 0; i < cards.length; i++) {
      // 문자의 코드 포인트 값을 이용해서 알파벳만 출력하기!
      if (cards[i] >= 65 && cards[i] <= 90) {
        System.out.print(cards[i]);
      }
    }
    System.out.println();

    // cards 배열에서 숫자만 가로로 출력해보기!
    // 숫자 코드 포인트 : 48~57
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] >= 48 && cards[i] <= 57) {
        System.out.print(cards[i]);
      }
    }
    System.out.println();
  }
}
