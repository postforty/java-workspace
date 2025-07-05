package section10.access._private.access1;

public class PublicD {
  public static void main(String[] args) {
    // PublicA 클래스의 생성자가 private 이기 때문에 다른 클래스(PublicD)에서는 호출 불가
    // PublicA publicA = new PublicA(10); // 생성자 접근 불가(객체 생성 불가)
  }
}
