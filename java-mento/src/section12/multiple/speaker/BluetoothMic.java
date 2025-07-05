package section12.multiple.speaker;

public class BluetoothMic implements Speaker, Microphone {
  public void music() {
    System.out.println("마이크에 장착된 스피커에서 반주가 나옵니다.");
  }
  public void sing() {
    System.out.println("마이크에 대고 노래를 부릅니다.");
  }
}
