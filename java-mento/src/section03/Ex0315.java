package section03;

public class Ex0315 {
  public static void main(String[] args) {
    System.out.println("---논리곱(AND연산)---");
    // false가 하나라도 있으면 false
    System.out.println(true && true); // true
    System.out.println(true && false); // false
    System.out.println(false && false); // false(단축 평가)

    System.out.println("---논리합(OR연산)---");
    // true가 하나라도 있으면 true
    System.out.println(true || true); // true(단축 평가)
    System.out.println(false || true); // true
    System.out.println(false || false); // false

    System.out.println("---배타적논리합(XOR연산)---");
    // true가 하나만 있으면 true
    System.out.println(true ^ true); // false
    System.out.println(false ^ true); // true
    System.out.println(true ^ false); // true
    System.out.println(false ^ false); // false
  }
}
