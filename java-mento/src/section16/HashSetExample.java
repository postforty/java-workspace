package section16;

import java.util.HashSet;

public class HashSetExample {
  public static void main(String[] args) {
    HashSet<TextMessage> msgSet = new HashSet<>();

    TextMessage msg1 = new TextMessage(1, "안녕하세요");
    TextMessage msg2 = new TextMessage(1, "안녕하세요");

    msgSet.add(msg1);
    msgSet.add(msg2);

    System.out.println(msgSet);

    // 물리적 주소는 다르지만
    System.out.println(System.identityHashCode(msg1));
    System.out.println(System.identityHashCode(msg2));

    // 논리적 주소는 같기때문에
    // HashSet은 동일 객체로 간주함(중복을 허용하지 않음)
    System.out.println(msg1.hashCode());
    System.out.println(msg2.hashCode());
  }
}
