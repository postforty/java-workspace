package section12._interface.usb;

public class Keyboard implements UsbDevice  {
  @Override
  public void connect() {
    System.out.println("키보드가 USB 포트에 연결됨!");
  }

  @Override
  public void transferData() {
    System.out.println("키보드 타이핑 데이터를 전송!");
  }

  @Override
  public void disconnect() {
    System.out.println("키보드가 USB 포트에서 분리됨!");
  }
}
