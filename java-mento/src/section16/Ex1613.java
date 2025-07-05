package section16;

import java.util.Arrays;
import java.util.List;

public class Ex1613 {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println(list); // [1, 2, 3, 4, 5]

    System.out.println(list.get(0)); // 1

    System.out.println("---");

    // 리스트는 인덱스를 가지고 있기때문에 반복문 사용 가능
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
