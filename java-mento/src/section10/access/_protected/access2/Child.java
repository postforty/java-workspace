package section10.access._protected.access2;

import section10.access._protected.access1.Parent; // 다른 패키지에 있는 부모 클래스라서 불러오기 해야함

public class Child extends Parent {
  void accessTest() {
    super.accessProtected(); // protected 접근 제한자가 붙어 있기 때문에 상속 관계이기 때문에 다른 패키지에 있더라고 접근 가능
  }
}
