package section07.family;

public class Ex0711 {
  public static void main(String[] args) {
    Family father = new Family();
    Family son = new Family();

    father.name = "김일남";
    father.age = 99;
    // father.country = "대한민국";

    son.name = "김이남";
    son.age = 59;
    // son.country = "대한민국";

    Family.country = "미국";

    System.out.printf("이름: %s, 나이: %d, 국적: %s\n", father.name, father.age, Family.country); // 정적 변수는 객체명이 아닌 클래스명으로 접근하는 것이 올바른 방식이다!
    System.out.printf("이름: %s, 나이: %d, 국적: %s\n", son.name, son.age, Family.country);
  }
}
