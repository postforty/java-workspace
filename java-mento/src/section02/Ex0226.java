package section02;

public class Ex0226 {
  public static void main(String[] args) {
    int i = 100;
    char c = 'd';
    int j = c; // 자동 형변환
    int k = c + 1; // 자동 형변환(문자형은 정수 연산 가능)
    char c2 = (char) k; // 강제 형변환

    System.out.println(i);
    System.out.println(c); // d
    System.out.println(j); // 100
    System.out.println(k); // 101
    System.out.println(c2); // e
  }
}
