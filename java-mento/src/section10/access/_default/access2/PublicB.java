package section10.access._default.access2;

import section10.access._default.access1.PublicA;

// import section10.access._default.access1.DefaultC; // 다른 패키지에 있는 default 접근 제한자 이기 때문에 접근 불가 

public class PublicB {
  public static void main(String[] args) {
    // 다른 패키지에 있는 default 접근 제한자 이기 때문에 접근 불가
    // DefaultC defaultC = new DefaultC();

    PublicA publicA = new PublicA(); // 접근 제한자 public 이기 때문에 가능
  }
}
