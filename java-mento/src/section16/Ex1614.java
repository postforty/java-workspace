package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1614 {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);

    System.out.println(set); // [1, 2, 3, 4, 5]

    // HashSet 객체는 순서가 없으므로 인덱스를 이용한 반복문 사용 불가
    // for (int i = 0; i < set.size(); i++) {
    //   System.out.println(set.get(i)); // Set은 get() 지원 안함 
    // }


    Iterator<Integer> iter = set.iterator(); // iterator 객체(반복 가능한 객체)로 변환

    System.out.println(iter);

    // Set 객체를 Iterator 객체로 변환하여 반복문에서 사용
    while(iter.hasNext()) {
      System.out.print(iter.next() + " "); // 1 2 3 4 5
    }

    // System.out.println(iter.hasNext()); // true
    // System.out.println(iter.next());

    // System.out.println(iter.hasNext()); // true
    // System.out.println(iter.next());

    // System.out.println(iter.hasNext()); // true
    // System.out.println(iter.next());

    // System.out.println(iter.hasNext()); // true
    // System.out.println(iter.next());

    // System.out.println(iter.hasNext()); // true
    // System.out.println(iter.next());

    // System.out.println(iter.hasNext()); // false
    // System.out.println(iter.next()); // NoSuchElementException 오류 발생
  }
}
