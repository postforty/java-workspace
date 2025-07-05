package section16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1612 {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3 , 4, 5};

    System.out.println(Arrays.toString(arr));

    // arr 배열에 요소를 추가, 삭제 어떻게???

    List<Integer> list = new ArrayList<>(Arrays.asList(arr));

    System.out.println(list); // [1, 2, 3, 4, 5]
    
    list.add(6); // 추가
    System.out.println(list); // [1, 2, 3, 4, 5, 6]
    
    list.remove(1); // 삭제
    System.out.println(list); // [1, 3, 4, 5, 6]

  }
}
