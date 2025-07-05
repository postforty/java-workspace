package section15;

public class Ex1518 {
  public static void main(String[] args) {
    String lat = "-37.3159";
    String lng = "81.1496";

    // double latDouble = lat; // 할당 불가(변환 불가)

    // 문자열 타입을 숫자 타입으로 변환하는 방법(Wrapper 클래스 사용)
    double latDouble = Double.parseDouble(lat);
    double lngDouble = Double.parseDouble(lng);

    // double 타입으로 변환되었기 때문에 연산 가능
    System.out.println(latDouble + 1); // -36.3159
    System.out.println(lngDouble + 1); // 82.1496
  }
}
