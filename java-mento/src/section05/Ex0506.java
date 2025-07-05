package section05;

public class Ex0506 {
  public static void main(String[] args) {
    // Ex0505.java의 구구단을 각 단이 세로로 출력되도록 수정해 보세요!
    for (int j = 1; j < 10; j++) {
      for (int i = 2; i < 10; i++) {
        System.out.printf("%d × %d = %d\t", i, j, i * j);
      }
      System.out.println();
    }
  }
}
