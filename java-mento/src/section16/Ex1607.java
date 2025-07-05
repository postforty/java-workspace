package section16;

import java.util.ArrayList;
import java.util.List;

public class Ex1607 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      int temp = (int) (Math.random() * 10) + 1;
      list.add(temp); // 요소 추가
    }

    System.out.println(list);

    System.out.println(list.size()); // 10(리스트의 길이 반환)

    for (int i = 0; i < list.size(); i++) {
      int value = list.get(i); // 조회

      if(value % 2 == 0) {
        System.out.print(value + " ");
      }
    }
  }
}
