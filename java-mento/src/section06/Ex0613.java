package section06;

import java.util.Arrays;

public class Ex0613 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3, 4, 5};

    // Arrays 클래스의 copyOf() 메서드를 이용한 깊은 복사
    int[] arr02 = Arrays.copyOf(arr01, arr01.length);

    arr01[1] = 0;

    System.out.println("arr01 : " + Arrays.toString(arr01));
    System.out.println("arr02 : " + Arrays.toString(arr02));

    // 각각의 배열의 주소를 출력해보면 각각 다른 주소를 가지고 있음
    System.out.println(arr01); 
    System.out.println(arr02);
  }
}
