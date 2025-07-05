package section07.practice;

public class Practice0704 {
  public static void main(String[] args) {
    Speaker speaker = new Speaker();
    speaker.turnOn();
  }
}

class Speaker {
  static int volume = 50;
  
  void turnOn() {
    // static int volume = 50; // 정적 멤버는 인스턴스 멤버 안에서 사용할 수 없음
    System.out.println("스피커의 전원이 켜졌습니다. 기본 볼륨은 " + volume + "입니다.");
  }
}
