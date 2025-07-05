package section02;

public class PrintPt {
  public static void main(String[] args) {
    System.out.printf("%f", 1.1234567); // 소숫점 6자리까지 표시(자동 반올림)
    System.out.println();
    System.out.printf("%.2f", 1.1234567);
    System.out.println();
    System.out.printf("%.2f", 1.456789); // 소숫점 2자리까지 표시(자동 반올림)
    System.out.println();
  }
}
