package section13;

class PrintOut {
  // 정적 내부 클래스(프로그램 실행시 메모리에 올라감)
  static class Out {
    void println(String str) {
      System.out.println(str);
    }
  }
}

public class StaticClassExample {
  public static void main(String[] args) {
    // Out out = new Out(); // 불가
    PrintOut.Out out = new PrintOut.Out();
    out.println("정적 내부 클래스 객체 생성 후 println() 메서드 호출");
  }
}
