package section12._interface.usb;

public class UsbMemory implements UsbDevice {
  String data;

  UsbMemory(String data) {
    this.data = data;
  }

  @Override
  public void connect() {
    System.out.println("USB 저장장치가 USB 포트에 연결됨!");
  }

  @Override
  public void transferData() {
    System.out.printf("USB 저장장치의 %s 데이터를 전송!\n", this.data);
  }

  @Override
  public void disconnect() {
    System.out.println("USB 저장장치가 포트에서 분리됨!");
  }
}
