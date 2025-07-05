package section15;

public class Ex1512 {
  public static void main(String[] args) {
    
    String str = "1234-5678";

    // 시작하는 인덱스를 인수로 넣음. 해당 인덱스에서 부터 끝까지 추출
    String subStr = str.substring(5);
    System.out.println(subStr);
    
    subStr = str.substring(str.indexOf('-')+1);
    System.out.println(subStr);
    
    // 주의) endIndex는 추출할때 포함 안됨
    subStr = str.substring(0, 4);
    System.out.println(subStr);

    subStr = str.substring(0, str.indexOf('-'));
    System.out.println(subStr);
  }
}
