package section15;

public class Ex1511 {
  public static void main(String[] args) {
    
    String htmlString = "<p>안녕하세요</p><b>반갑습니다</b><span>잘 지내셨나요?</span>";

    // replaceAll() 메서드는 replace() 메서드와 달리 정규 표현식(Regular Expression)을 사용할 수 있음
    String plainText = htmlString.replaceAll("<.*?>", "");
    System.out.println(plainText);
  }
}
