package section15.practice;

public class Practice1502 {
  public static void main(String[] args) {
    String sentence1 = "사과";
    String sentence2 = new String("사과");
    String sentence3 = "망고";

    // 객체 비교 결과 -> 모두 다른 객체
    System.out.println(sentence1 == sentence2); // false
    System.out.println(sentence2 == sentence3); // false

    // 값 비교 결과 -> 사과는 같음
    System.out.println(sentence1.equals(sentence2)); // true
    System.out.println(sentence2.equals(sentence3)); // false
  }
}
