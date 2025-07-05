package section12._interface.usb;

public class Ex1214 {
  public static void main(String[] args) {
    Computer computer = new Computer();

    Mouse mouse = new Mouse();
    computer.plugInUsb(mouse);

    UsbMemory usb100GB = new UsbMemory("사진");
    computer.plugInUsb(usb100GB);

    Keyboard keyboard = new Keyboard();
    computer.plugInUsb(keyboard);
  }
}
