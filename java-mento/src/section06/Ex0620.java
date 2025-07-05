package section06;

public class Ex0620 {
  public static void main(String[] args) {
    int[] scores = {87, 94, 98};

    int sum = 0;

    for (int score : scores) {
      sum += score;
    }

    System.out.println("국영수 총합: " + sum);
    System.out.println("국영수 평균: " + sum / scores.length);
  }
}
