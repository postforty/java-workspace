package section12._interface.usb;

// 인터페이스의 구현(implements 사용)
public class Mouse implements UsbDevice {
  // 인터페이스의 구현은 모두 public
  @Override
  public void connect() {
    System.out.println("마우스가 USB 포트에 연결됨!");
  }

  @Override
  public void transferData() {
    System.out.println("마우스 움직임 데이터를 전송!");
  }

  @Override
  public void disconnect() {
    System.out.println("마우스가 USB 포트에서 분리됨!");
  }
}
