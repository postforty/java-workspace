package section15;

public class Ex1515 {
  public static void main(String[] args) {
    int val1 = 15;
    int val2 = 8;
    int val3 = 25;
    int val4 = 12;

    int maxOfFour = Math.max(val1, Math.max(val2, Math.max(val3, val4)));
    System.out.println(maxOfFour);

    // 최솟값 구해보세요~
    int minOfFour = Math.min(val1, Math.min(val2, Math.min(val3, val4)));
    System.out.println(minOfFour);
  }
}
