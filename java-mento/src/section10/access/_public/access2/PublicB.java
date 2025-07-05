package section10.access._public.access2;

import section10.access._public.access1.PublicA; // 다른 패키지의 클래스 불러오기

public class PublicB {
  public static void main(String[] args) {
    // 접근 제한자 public는 다른 패키지, 클래스에 있더라도 접근 가능
    PublicA publicA = new PublicA(10);
    publicA.printA();
  }
}
