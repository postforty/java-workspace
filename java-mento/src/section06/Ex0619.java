package section06;

public class Ex0619 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };

    // 인덱스와 요소를 함께 사용해야 하는 경우에 편리함
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("---");

    // 향상된 for문
    // - 배열의 요소를 순회하는 경우에 편리함(인덱스 사용하지 않는 경우)
    for (int number : arr) {
      System.out.println(number);
    }
  }
}
