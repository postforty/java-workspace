package section05;

public class Ex0512 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("짝수의 합: " + sum);

    System.out.println("---");
    
    sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        continue;
      }
      sum += i;
    }
    System.out.println("짝수의 합: " + sum);
  }
}
