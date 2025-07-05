package section11.implicit;

public class Calendar {
  String color;
  int months;

  Calendar(String color, int months) {
    this.color = color;
    this.months = months;
  }

  void info() {
    System.out.println(this.color + " 달력은 " + this.months + "월까지 있습니다.");
  }

  void hanging() {
    System.out.println(this.color + " 달력을 벽에 걸 수 있습니다.");
  }
}
