package section08.jogger;

public class Ex0805 {
  public static void main(String[] args) {
    Jogger kim1 = new Jogger();
    kim1.name = "김일남";
    System.out.println(kim1.name);
    kim1.sayName();
    kim1.run();

    /*
     * 김이남
     * 제 이름은 김이남입니다.
     * run run run
     */

    Jogger kim2 = new Jogger();
    kim2.name = "김이남";
    System.out.println(kim2.name);
    kim2.sayName();
    kim2.run();
  }
}
