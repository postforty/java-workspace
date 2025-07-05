package section15;

public class Ex1501 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";

    System.out.println("str1 vs str2 : " + (str1 == str2)); // true
    
    String str3 = new String("hello");
    System.out.println("str1 vs str3 : " + (str1 == str3)); // false

    System.out.println(str1);
    System.out.println(str3);

    // 자발 lang 패키지에 있는 System 클래스의 identityHashCode() 메서드는 객체의 물리적 식별자(메모리 주소 등)를 기반으로 한 고유 해시 코드를 반환
    // 동등 비교연산자(==)는 객체가 가지고 있는 값이 아닌 해시 코드를 비교
    System.out.println("str1 : " + System.identityHashCode(str1));
    System.out.println("str2 : " + System.identityHashCode(str2));
    System.out.println("str3 : " + System.identityHashCode(str3));
  }
}
