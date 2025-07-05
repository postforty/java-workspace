package section11.implicit;

public class Ex1105 {
  public static void main(String[] args) {
    DeskCalendar deskCalendar = new DeskCalendar("보라색", 6);
    deskCalendar.info();
    deskCalendar.hanging();
    deskCalendar.onTheDesk();

    System.out.println("---");

    // 자동 형변환 == 묵시적 형변환(Implicit Casting)
    Calendar calendar = deskCalendar;
    calendar.info();
    calendar.hanging(); // 부모 클래스의 메서드 hanging()이 호출되는 것이 아니라 "오버라이딩된 자식 클래스의 메서드" hanging()이 호출됨⭐⭐⭐⭐⭐
    // calendar.onTheDesk(); // 부모 클래스인 Calendar에는 onTheDesk() 메서드가 없기 때문에 사용 불가!

  }
}
