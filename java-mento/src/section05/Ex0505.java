package section05;

public class Ex0505 {
  // 코드 정렬 단축키 : alt + shift + f
  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      // 이모지, 특수문자 단축키 : win + .
      // 2 × 1 = 2
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d × %d = %d\t", i, j, i * j);
      }
      System.out.println();
    }
  }
}
