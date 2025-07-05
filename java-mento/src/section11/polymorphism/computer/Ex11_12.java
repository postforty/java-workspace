package section11.polymorphism.computer;

public class Ex11_12 {
  public static void main(String[] args) {
    ComputerRoom room = new ComputerRoom();
    room.computer1 = new Samsong();
    room.computer2 = new Samsong();

    room.allPowerOn();
    room.allPowerOff();
  }
}
