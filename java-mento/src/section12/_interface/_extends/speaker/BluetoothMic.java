package section12._interface._extends.speaker;

// Speaker, Microphone 인터페이스 다중 상속
public interface BluetoothMic extends Speaker, Microphone {
  // 다중 상속했기 때문에 상속 받은 인터페이스의 추상 메서드 불필요
  // public void music();
  // public void sing();

  // BluetoothMic는 인터페이스이기 때문에 일반 메서드 정의 불가
  // public void music() {
  //   System.out.println("마이크에 장착된 스피커에서 반주가 나옵니다.");
  // }
  // public void sing() {
  //   System.out.println("마이크에 대고 노래를 부릅니다.");
  // }

  // 추가 기능
  void connect();
}
