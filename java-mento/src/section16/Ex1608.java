package section16;

import java.util.LinkedList; // LinkedList 불러오기
import java.util.List;

public class Ex1608 {
  public static void main(String[] args) {
    // ArrayList와 LinkedList 내부 구조만 다를 뿐 사용 방법은 동일함
    List<Integer> list = new LinkedList<>(); // ArrayList를 LinkedList로 변경

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
