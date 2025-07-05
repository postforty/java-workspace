package section08.parameter;

public class Ex0817 {
  public static void main(String[] args) {
    int[] studentA = {97, 94, 83};
    int[] studentB = {87, 84, 93};

    MidTerm mid = new MidTerm();
    // System.out.println(mid.score(studentA));
    // System.out.println(mid.score(studentB));

    // 메서드 호출 후 return으로 반환된 값은 변수에 할당 가능
    int a = mid.score(studentA);
    int b = mid.score(studentB);

    if (a > b) {
      System.out.println("A학생의 중간고사 총점이 더 높습니다.");
    } else if (a < b) {
      System.out.println("B학생의 중간고사 총점이 더 높습니다.");
    } else {
      System.out.println("두 학생의 중간고사 총점이 같습니다.");
    }
  }
}
