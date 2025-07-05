package section15;

import java.util.HashSet;
import java.util.Set;

public class MemberCompareExample {
  public static void main(String[] args) {
    Member kim1 = new Member();
    Member kim2 = new Member();

    // hashCode는 논리적 식별자이기 때문에 hashCode() 메서드를 오버라이딩해서 변경 가능하고 객체의 중복을 허용하지 않는 HashSet, HashMap에서 equals() 메서드와 함께 동일한 객체인지 판별하는 데 사용
    kim1.setMemberId(100);
    kim1.setMemberName("김일남");

    kim2.setMemberId(100);
    kim2.setMemberName("김일남");

    System.out.println(kim1.hashCode());
    System.out.println(kim2.hashCode());

    Set<Member> list = new HashSet<>();
    list.add(kim1);
    list.add(kim2);

    System.out.println(list);
    System.out.println(list.size());
  }
}
