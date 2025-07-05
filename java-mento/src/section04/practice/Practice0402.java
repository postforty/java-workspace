package section04.practice;

public class Practice0402 {
  public static void main(String[] args) {
    int score = 77;
    char result = 'A';

    // 조건식을 잘못 사용한 케이스
    if (score >= 60) { // true
      result = 'D';
    } else if (score >= 70) { // true
      result = 'C';
    }

    System.out.printf("%d점의 학점은 %s입니다.\n", score, result);
  }
}
