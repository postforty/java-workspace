package section06.practice;

public class Practice0602 {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      // arr의 요소 중 짝수만 sum에 누적해 보세요!
      if (arr[i] % 2 == 0) {
        sum += arr[i];
      }
    }

    System.out.println("짝수의 합: " + sum);
  }
}
