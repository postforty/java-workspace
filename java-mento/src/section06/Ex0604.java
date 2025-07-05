package section06;

public class Ex0604 {
  public static void main(String[] args) {
    int[] intArr = new int[5];
    System.out.println(intArr[0]); // 0 (정수형 초기값)

    double[] doubleArr = new double[5];
    System.out.println(doubleArr[0]); // 0.0 (실수형 초기값)

    char[] charArr = new char[5];
    System.out.println(charArr[0]); // '' (문자형 초기값)

    String[] strArr = new String[5];
    System.out.println(strArr[0]); // null (객체형 초기값)

    int var;
    // System.out.println(var); // 사용불가 (변수는 자동 초기화 되지 않음)
  }
}
