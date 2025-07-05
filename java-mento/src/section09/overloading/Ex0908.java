package section09.overloading;

public class Ex0908 {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    p1.phoneInfo();

    Phone p2 = new Phone("갤럭시");
    p2.phoneInfo();

    Phone p3 = new Phone("갤럭시", 24);
    p3.phoneInfo();

    Phone p4 = new Phone("갤럭시", 24, "흰색");
    p4.phoneInfo();

    Phone p5 = new Phone("흰색", 24, "갤럭시");
    p5.phoneInfo();

  }
}
