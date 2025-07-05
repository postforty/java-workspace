package section08.parameter;

public class Calc {
  void sum(int num1, int num2) {
    int result = num1 + num2;
    System.out.println(num1 + "+" + num2 + "=" + result);
  }

  void sumAll(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result += num;
    }

    System.out.println("입력된 숫자의 합은 " + result + "입니다.");
  }
}
