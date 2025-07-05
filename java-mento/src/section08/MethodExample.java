package section08;

public class MethodExample {

  // 매개변수(parameter), 인자
  // 인수(argument)

  // 1. 반환값 X, 매개변수 X
  static void method1() {
    System.out.println("1. 반환값 X, 매개변수 X");
  }

  // 2. 반환값 X, 매개변수 O
  static void method2(String param) {
    System.out.println(param);
  }

  // 3. 반환값 O, 매개변수 X
  static String method3() {
    return "3. 반환값 O, 매개변수 X";
  }

  // 4. 반환값 O, 매개변수 O
  static String method4(String param) {
    return param;
  }

  public static void main(String[] args) {
    // System.out.println(MethodExample.method1()); // 반환값이 없으므로 불가!
    MethodExample.method1(); // 1. 반환값 X, 매개변수 X
    MethodExample.method2("2. 반환값 X, 매개변수 O"); // 2. 반환값 X, 매개변수 O
    System.out.println(MethodExample.method3()); // 3. 반환값 O, 매개변수 X
    System.out.println(MethodExample.method4("4. 반환값 O, 매개변수 O")); // 4. 반환값 O, 매개변수 O
  }
}
