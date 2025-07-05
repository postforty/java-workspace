package section15;

public class Ex1502 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";

    System.out.println("str1 vs str2 : " + (str1 == str2)); // true
    
    String str3 = new String("hello");
    System.out.println("str1 vs str3 : " + (str1 == str3)); // false
    
    // Object 클래스의 equals() 메서드는 객체가 가지고 있는 값을 비교
    System.out.println("str1 vs str2(equals) : " + (str1.equals(str2))); // true
    System.out.println("str1 vs str3(equals) : " + (str1.equals(str3))); // true
  }
}
