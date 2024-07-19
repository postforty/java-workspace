package section15.practice.p02;

import java.util.Objects;

class Student {
    String name;
    int studentNumber;

    Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;
        return studentNumber == student.studentNumber && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentNumber); // 주어진 객체를 기반으로 해시코드를 간편하게 생성
    }

}

public class Practice1502 {
    public static void main(String[] args) {
        Student student = new Student("김일남", 1);
        Student student1 = new Student("김일남", 1);
        Student student2 = new Student("김이남", 2);
        
        System.out.println(student.equals(student1)); // true
        System.out.println(student.equals(student2)); // false
    }
}
