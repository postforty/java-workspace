package section16;

import java.util.HashSet;
import java.util.Set;

public class Ex1611 {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    System.out.println(set); // []
    
    set.add("apple");
    set.add("mango");
    set.add("banana");

    // 추가한 순서를 보장하지 않음
    System.out.println(set); // [banana, apple, mango]
    
    set.remove("mango");
    System.out.println(set); // [banana, apple]
    
    set.remove("mango"); // 삭제하고자 하는 객체가 없더라도 오류 발생하지 않음
    System.out.println(set); // [banana, apple]

  }
}
