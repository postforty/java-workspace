package section04;

public class Ex0401 {
  public static void main(String[] args) {
    // if 조건문
    // 1) 실행할지 말지
    // 2) 둘 중 하나
    // 3) 여럿 중 하나

    // 1) 실행할지 말지
    System.out.println("일어나기!");
    System.out.println("밥먹기!");

    boolean raining = false;

    // if (조건식) {실행할 코드}
    if (raining) {
      System.out.println("우산 가져가기!");
    }

    System.out.println("학원가기!");
  }
}
