package section08.parameter;

public class Bus {
  void take(int m) {
    // 무한 루프
    while(true) {
      if(m < 3000) {
        System.out.println("교통카드를 충전하러 갑니다.");
        // break;
        return; // 메서드 자체를 종료하기 때문에 반복문 중단 가능
      }
      m -= 1500; // 반복될 때마다 버스 요금 차감
      System.out.println("버스를 탑니다. 현재 잔액은 " + m + "입니다.");
    }
  }
}
