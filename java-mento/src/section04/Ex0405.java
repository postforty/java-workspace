package section04;

public class Ex0405 {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;

    int max = 0;

    // 두 숫자 중 최댓값 구하기!
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }

    System.out.println(max);
  }
}
