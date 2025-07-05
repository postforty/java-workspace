package section05;

public class Ex0511 {
  public static void main(String[] args) {
    // continue
    // - 반복문의 조건식이 true인 경우 반복은 유지
    // - continue 아래 코드는 실행하지 않음
    for(int i=1; i <= 10; i++) {
      System.out.println(i + "번째 for문 시작!");
      continue; // continue 아래에 있는 코드는 절대 실행되지 않음
      // System.out.println("추가 실행 코드"); // Unreachable
    }
  }
}
