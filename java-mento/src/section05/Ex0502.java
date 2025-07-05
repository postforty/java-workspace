package section05;

public class Ex0502 {
  public static void main(String[] args) {
    // 1 ~ 5까지 모든 정수의 합
    // 1 + 2 + 3 + 4 + 5

    int sum = 0;

    for (int i = 1; i < 6; i++) {
      // System.out.println(i);
      // sum = sum + i;
      sum += i;
    }

    System.out.println("합: " + sum);
  }
}
