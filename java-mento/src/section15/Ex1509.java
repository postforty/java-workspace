package section15;

public class Ex1509 {
  public static void main(String[] args) {
    
    String str = "HelloWorld_MyWorld";

    int idx = str.indexOf("Word"); // 찾을 수 없다면 -1 반환
    idx = str.indexOf("World"); // 5(찾았다면 시작하는 인덱스 반환, 동일한 문자열이 있더라도 최초에 찾은 문자열의 인덱스 반환)

    System.out.println(idx);
    
    idx = str.indexOf("World", 6); // 두번째 인수에 시작하는 인덱스를 추가하면 해당 인덱스에서 부터 찾기 시작
    System.out.println(idx);
  }
}
