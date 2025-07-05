package section07.student;

public class Student {
  // --- 정적 멤버 (시작) ---
  // 속성
  // 정적 변수
  static String schoolName = "코리아 IT 아카데미"; // 유지보수성 올라감

  // 기능
  // 정적 메서드
  static void goToSchool() {
    System.out.println(Student.schoolName + "학교에 갑니다.");
  }
  // --- 정적 멤버 (끝) ---

  // --- 인스턴스 멤버 (시작) ---
  // 인스턴스 변수
  String studentName;

  // 인스턴스 메서드
  void hello() {
    System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
  }
  // --- 인스턴스 멤버 (끝) ---
}
