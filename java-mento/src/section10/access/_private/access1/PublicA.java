package section10.access._private.access1;

public class PublicA {
  int a;

  // private 접근 제한자는 동일 클래스 안에서만 접근 가능
  private PublicA(int a) {
    this.a = a;
  }

  void printA() {
    System.out.println("PublicA 클래스 printA() 메서드");
  }
}
