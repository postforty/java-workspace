package section06;

public class Ex0617 {
  public static void main(String[] args) {
    // ==, equals를 이용한 객체 비교 유의!!!

    String str1 = "123";
    String str2 = "123";
    String str3 = new String("123");
    String str4 = new String("123");

    // ==는 값이 아닌 주소를 비교함(참조 비교, Call by reference)
    System.out.println(str1 == str2); // true
    System.out.println(str2 == str3); // false
    System.out.println(str3 == str4); // false

    // equals() 메서드는 값을 비교함(값 비교, Call by value)
    System.out.println(str1.equals(str2)); // true
    System.out.println(str2.equals(str3)); // true
    System.out.println(str3.equals(str4)); // true

    // System.out.println(str1.hashCode()); // 48690
    // System.out.println(str2.hashCode()); // 48690
    // System.out.println(str3.hashCode()); // 48690
    // System.out.println(str4.hashCode()); // 48690

    System.out.println("str1 : " + System.identityHashCode(str1));
    System.out.println("str2 : " + System.identityHashCode(str2));
    System.out.println("str3 : " + System.identityHashCode(str3));
    System.out.println("str4 : " + System.identityHashCode(str4));
  }
}
