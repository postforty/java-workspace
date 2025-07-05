package section06;

import java.util.Arrays;

public class Ex0608 {
  public static void main(String[] args) {
    // 오름차순 정렬 어떻게???
    int[] arr = {3, 5, 2, 4, 1};
    int temp = 0;

    // 버블 정렬 알고리즘
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        // 왼쪽 값과 오른쪽 값을 비교
        // 왼쪽 값이 오른쪽 값 보다 큰 경우 스왑
        if(arr[j] > arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      // System.out.println(Arrays.toString(arr));
      // break;
    }
    System.out.println(Arrays.toString(arr));
  }
}
