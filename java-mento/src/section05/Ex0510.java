package section05;

public class Ex0510 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    // while문 내 조건식이 false이더라도 do 블럭의 코드가 최소 1번은 실행됨
    do {
      System.out.println("while문 실행");
      sum += i;
      i++;
    }
    while(i <= 0);

    System.out.println("합: " + sum);
  }
}