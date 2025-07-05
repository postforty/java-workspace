package section15;

public class Ex1503 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    String str3 = new String("hello");
    String str4 = "hi";

    // hashCode()는 Object 클래스의 메서드
    System.out.println("str1 hashCode : " + str1.hashCode()); // 논리적 식별자(변경 가능, 오버라이딩 가능)
    // identityHashCode()는 System 클래스의 메서드
    System.out.println("str1 identityHashCode: " + System.identityHashCode(str1)); // 물리적 식별자
    
    System.out.println("str3 hashCode : " + str3.hashCode());
    System.out.println("str3 identityHashCode: " + System.identityHashCode(str3)); // 물리적 식별자
    System.out.println("str4 hashCode : " + str4.hashCode());
  }
}
