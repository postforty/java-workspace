package section02;

public class Ex0215 {
  public static void main(String[] args) {
    // 기본자료형: 문자형
    // - 문자형은 "코드포인트" 값을 가짐
    char ga = '가';
    System.out.println(ga);

    char alphaA = 'A';
    char alphaB = 'B';
    System.out.println(alphaA);
    System.out.println(alphaB);

    // int alphaIntA = 'A';
    // int alphaIntB = 'B';
    long alphaIntA = alphaA;
    int alphaIntB = alphaB;
    System.out.println(alphaIntA); // 65
    System.out.println(alphaIntB); // 66
    int alphaIntC = 'C';
    System.out.println(alphaIntC); // 66
  }
}
