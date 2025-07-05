package section11.implicit;

public class DeskCalendar extends Calendar {
  DeskCalendar(String color, int months) {
    super(color, months);
  }

  @Override
  void hanging() {
    System.out.println(this.color + " 달력을 벽에 걸기 위해 고리가 필요합니다.");
  }

  void onTheDesk() {
    System.out.println(this.color + " 달력을 책상에 세울 수 있습니다.");
  }
}
