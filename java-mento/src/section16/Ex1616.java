package section16;

import java.util.HashSet;
import java.util.Set;

public class Ex1616 {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);

    System.out.println(set); // [1, 2, 3, 4, 5]

    // 향상된 for
    // - 내부적으로 Iterator를 사용하여 컬렉션을 순회
    // - 명시적으로 Iterator를 호출할 필요 없음
    for(Integer el:set) {
      System.out.print(el + " ");
    }
  }
}
