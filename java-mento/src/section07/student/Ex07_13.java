package section07.student;

public class Ex07_13 {
  public static void main(String[] args) {
    // 정적 멤버는 인스턴스 생성 없이 사용 가능
    System.out.println(Student.schoolName);
    Student.goToSchool();
  }
}
