package section12._interface.usb;

// 인터페이스의 정의(선언)
public interface UsbDevice {

  // 인터페이스의 모든 메서드는 추상 메서드
  public abstract void connect(); // 장치 연결 기능
  // public abstract 생략 가능
  void transferData(); // 데이터 전송 기능
  void disconnect(); // 장치 연결 해제 기능
}