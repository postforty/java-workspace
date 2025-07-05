package section09.practice;

public class Practice0903 {
  public static void main(String[] args) {
    Computer computer = new Computer("삼송");
    computer.logo();
  }
}

class Computer {
  String name;

  Computer(String name) {
    this.name = name;
  }

  void logo() {
    System.out.println("사랑해요 " + this.name);
  }
}
