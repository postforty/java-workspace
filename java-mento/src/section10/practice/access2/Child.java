package section10.practice.access2;

import section10.practice.access1.Parent;

public class Child extends Parent {

  Parent parent = new Parent();

  void accessParentMethod() {
    // 다른 패키지의 부모 클래스의 protected에 접근할 때 super 키워드 사용
    super.parentMethod();
  }
}
