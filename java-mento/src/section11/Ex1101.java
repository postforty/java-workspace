package section11;

class Parent {}
class Child extends Parent {}

public class Ex1101 {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    System.out.println(parent); //  section11.Parent@54bedef2
    System.out.println(child); //   section11.Child@5caf905d
    
    // 자동 형변환
    // Child 타입을 Parent으로 형변환
    // 상속 관계에서 자식 클래스 타입을 부모 클래스 타입으로 자동 형변환
    Parent childToParent = child; 
    System.out.println(childToParent); // section11.Child@5caf905d

    Parent childToParent2 = new Child(); // 자식 생성자 호출하여 객체 생성한 후 부모 타입 참조 변수에 할당
    System.out.println(childToParent2);

    // 부모 타입에서 자식 타입으로 강제 형변환
    Child parentToChild = (Child) childToParent2;

    // 주의!!!
    // 자식 타입에서 부모 타입으로 자동 형변환 된 경우에만
    // 부모 타입에서 자식 타입으로 강제 형변환 가능!

    // 강제 형변환 불가인 경우
    Parent parent3 = new Parent();
    Child notCasting = (Child) parent3; // ClassCastException 런타임 오류 발생
  }
}
