package section08.getter.setter;

public class Ex0821 {
  public static void main(String[] args) {
    Person kim = new Person();

    // private 접근 제한자로 정보 은닉하여 접근 불가
    // kim.age = 30;
    // kim.age = -30;

    kim.setAge(30); // setter 메서드 호출
    kim.setAge(-30); // 유효성 검사에서 필터링

    System.out.println("김일남님의 나이는 " + kim.getAge() + "세입니다."); // setter 메서드 호출
  }
}
