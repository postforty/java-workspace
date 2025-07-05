package section11.polymorphism.computer;

public class ComputerRoom {
  // Samsong computer1;
  // Samsong computer2;
  // Lz computer1;
  // Lz computer2;
  Computer computer1;
  Computer computer2;

  void allPowerOn() {
    computer1.powerOn();
    computer2.powerOn();
  }

  void allPowerOff() {
    computer1.powerOff();
    computer2.powerOff();
  }
}
