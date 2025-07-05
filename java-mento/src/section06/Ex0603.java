package section06;

public class Ex0603 {
  public static void main(String[] args) {
    int[] numbers = new int[50];

    // System.out.println(numbers.length); // 배열의 길이 확인

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
