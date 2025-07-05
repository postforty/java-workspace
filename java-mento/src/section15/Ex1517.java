package section15;

public class Ex1517 {
  public static void main(String[] args) {
    Integer num1 = new Integer(10); // 권장하지 않는 방식
    Integer num2 = Integer.valueOf(10); // Integer Wrapper 클래스 타입
    System.out.println(num2);
    
    int num3 = 10; // 기본 타입
    System.out.println(num3);
    
    Integer num4 = 10; // 오토박싱
    System.out.println(num4);
    
    int num5 = num4; // 오토언박싱
    System.out.println(num5);
  }
}
