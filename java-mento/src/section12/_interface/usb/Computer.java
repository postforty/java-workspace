package section12._interface.usb;

public class Computer {
  void plugInUsb(UsbDevice usbDevice) {
    System.out.println("--- USB 장치 연결 시도 ---");
    usbDevice.connect();
    usbDevice.transferData();
    usbDevice.disconnect();
    System.out.println("--- USB 장치 연결 해제 완료 ---");
  }
}
