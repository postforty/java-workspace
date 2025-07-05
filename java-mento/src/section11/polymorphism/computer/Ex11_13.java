package section11.polymorphism.computer;

public class Ex11_13 {
  public static void main(String[] args) {
    ComputerRoom room = new ComputerRoom();
    room.computer1 = new Lz();
    room.computer2 = new Lz();

    room.allPowerOn();
    room.allPowerOff();
  }
}
