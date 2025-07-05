package section15.practice;

public class Practice1503 {
  public static void main(String[] args) {
    
    String str = "100";
    int result = 0;

    // int - Integer
    // parse~ 메서드 사용하여 해결
    Integer strToInteger = Integer.parseInt(str);

    result = 100 + strToInteger;

    System.out.println("숫자 합: " + result);
  }
}
