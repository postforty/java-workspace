package section05;

public class Ex0503 {
  public static void main(String[] args) {
    // 짝수/홀수 구하기
    // 어떤 값을 2로 나누고 나머지가 1인 경우 홀수, 0인 경우 짝수
    // System.out.println(5 % 2);
    // System.out.println(4 % 2);
    // System.out.println(3 % 2);
    // System.out.println(2 % 2);

    // 1부터 100까지 짝수의 합계
    int sum = 0;

    for (int i = 1; i < 101; i++) {
      if (i % 2 == 0) {
        // System.out.println(i);
        sum += i;
      }
    }

    System.out.println("짝수의 합: " + sum);

    sum = 0;
    // 1부터 100까지 홀수의 합계
    for (int i = 1; i < 101; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }

    System.out.println("홀수의 합: " + sum);
  }
}
