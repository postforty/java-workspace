package section09;

class SnackPara {
  int price;

  // 기본 생성자
  SnackPara() {
  }

  // 매개 변수가 1개인 생성자 정의
  // 이점: 필드를 객체 생성할 때 인수로 초기화
  SnackPara(int p) {
    price = p;
  }

  void info() {
    System.out.println("과자의 가격은 " + price + "입니다.");
  }
}

public class Ex0903 {
  public static void main(String[] args) {
    SnackPara chip = new SnackPara();
    chip.price = 2000; // 필드 초기화
    chip.info();

    SnackPara cookie = new SnackPara(5000);
    cookie.info();
  }
}
