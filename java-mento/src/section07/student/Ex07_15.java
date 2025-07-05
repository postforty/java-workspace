package section07.student;

public class Ex07_15 {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    student1.studentName = "김일남";
    student2.studentName = "김이남";
    student3.studentName = "김삼남";

    Student.goToSchool();
    student1.hello();
    
    Student.goToSchool();
    student2.hello();
    
    Student.goToSchool();
    student3.hello();

  }
}
