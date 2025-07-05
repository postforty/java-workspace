package section06;

public class Ex0605 {
  public static void main(String[] args) {
    int[] numbers = new int[10];

    // 1~30까지 정수형 난수를 numbers 배열의 0~9번 인덱스 요소에 할당
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random() * 30) + 1;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
