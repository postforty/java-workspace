package section05;

public class Ex0513 {
  public static void main(String[] args) {
    // break
    // - 반복을 강제(반복문의 조건식이 true이더라도) 중단 함
    // - break 아래에 있는 코드는 실행 안됨
    while (true) {
      System.out.println("무한 루프1");
      break;
      // System.out.println("무한 루프2"); // Unreachable
    }
  }
}
