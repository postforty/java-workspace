package section05;

public class Ex0509 {
  public static void main(String[] args) {
    // while
    // - for문은 반복횟수가 정해져 있을때 유용함
    // - while문은 반복횟수가 정해져 있지 않을때 유용함
    int sum = 0;
    int i = 1;

    while(i <= 10) {
      sum += i; // i값을 sum에 누적
      i++;
    }

    System.out.println("합: " + sum);
  }
}
