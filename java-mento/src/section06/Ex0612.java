package section06;

import java.util.Arrays;

public class Ex0612 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3};
    int[] arr02 = new int[3];
    
    // 배열의 깊은 복사
    // arr02[0] = arr01[0];
    // arr02[1] = arr01[1];
    // arr02[2] = arr01[2];

    // for문을 이용한 배열의 깊은 복사
    for (int i = 0; i < arr01.length; i++) {
      arr02[i] = arr01[i];
    }

    arr01[1] = 0;

    System.out.println("arr01 : " + Arrays.toString(arr01));
    System.out.println("arr02 : " + Arrays.toString(arr02));

    // 각각의 배열의 주소를 출력해보면 각각 다른 주소를 가지고 있음
    System.out.println(arr01); 
    System.out.println(arr02);
  }
}
