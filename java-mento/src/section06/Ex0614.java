package section06;

import java.util.Arrays;

public class Ex0614 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3, 4, 5};
    int[] arr02 = new int[arr01.length];

    // System 클래스의 arraycopy() 메서드를 이용한 깊은 복사
    System.arraycopy(arr01, 0, arr02, 0, arr01.length);
    // System.arraycopy(arr01, 2, arr02, 0, 3);

    arr01[1] = 0;

    System.out.println("arr01 : " + Arrays.toString(arr01));
    System.out.println("arr02 : " + Arrays.toString(arr02));

    // 각각의 배열의 주소를 출력해보면 각각 다른 주소를 가지고 있음
    System.out.println(arr01); 
    System.out.println(arr02);
  }
}
