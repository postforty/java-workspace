package section17.practice;

@FunctionalInterface
interface Compare {
  // 추상 메서드 정의
  void compareValue(int num01, int num02);
}

public class Practice1704 {
  public static void main(String[] args) {
    
    int num01 = 20;
    int num02 = 30;

    // 두 수의 크기를 비교하는 코드
    Compare compare = (x, y) -> {
      if (x > y) {
        System.out.println("두수 " + x + "와 " + y + "중 " + x + "이 더 큽니다.");
      } else if (x < y) {
        System.out.println("두수 " + x + "와 " + y + "중 " + y + "이 더 큽니다.");
      } else {
        System.out.println("두수 " + x + "와 " + y + "는 같습니다.");
      }
    };

    compare.compareValue(num01, num02);
  }
}
