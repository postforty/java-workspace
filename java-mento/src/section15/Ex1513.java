package section15;

public class Ex1513 {
  public static void main(String[] args) {
    String str = "Hello";
    str += " World";

    System.out.println(str);

    // StringBuffer와 StringBuilder가 제공하는 메서드는 동일함(같은 기능 제공)
    // StringBuffer는 스레드 환경에서 더 유리함
    // StringBuffer strBuilder = new StringBuffer("Hello");
    StringBuilder strBuilder = new StringBuilder("Hello");
    // StringBuilder 클래스가 제공하는 메서드는 새로운 객체를 반환하지 않음(기존 객체를 변경함)
    strBuilder.append(" World"); // 기존 문자열의 마지막 인덱스 이후로 문자열 추가
    System.out.println(strBuilder);
    
    System.out.println(strBuilder.length()); // 문자열 길이 반환
    
    strBuilder.delete(0, 6); // 문자열의 특정 인덱스 구간 삭제
    System.out.println(strBuilder);
    
    strBuilder.insert(0, "Hi, "); // 문자열의 특정 인덱스에 문자열 삽입
    System.out.println(strBuilder);
    
    strBuilder.reverse(); // 문자열 뒤집기
    System.out.println(strBuilder);
  }
}
