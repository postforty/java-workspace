package section15;

public class Ex1510 {
  public static void main(String[] args) {
    
    String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있습니다.";

    // String newStr = str.replace("자바", "Java");
    String newStr = str.replaceAll("자바", "Java");
    
    // 원본은 변경되지 않음
    System.out.println(str);

    System.out.println(newStr);
  }
}
