package section06;

import java.util.Arrays;

public class Ex0611 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3};
    int[] arr02 = arr01; // 얕은 복사(주소만 복사)

    arr01[1] = 0;

    System.out.println("arr01 : " + Arrays.toString(arr01));
    System.out.println("arr02 : " + Arrays.toString(arr02));

    // 각각의 배열의 주소를 출력해보면 동일한 주소를 가지고 있음
    System.out.println(arr01); 
    System.out.println(arr02);
  }
}
