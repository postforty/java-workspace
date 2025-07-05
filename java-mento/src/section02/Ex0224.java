package section02;

public class Ex0224 {
  public static void main(String[] args) {
    // 실수형에서 정수형으로
    double double1 = 1.12345;
    // int int1 = double1; // 자동 형변환 불가(소수점 손실 발생)
    int int1 = (int) double1; // 강제 형변환
    // long long1 = double1; // 자동 형변환 불가(소수점 손실 발생)
    long long1 = (long) double1; // 강제 형변환

    System.out.println();

    // 정수형에서 실수형으로
    int int2 = 123;
    // double double2 = (double) int2;
    double double2 = int2; // 자동 형변환

    long long2 = 123;
    double2 = long2; // 자동 형변환
    System.out.println(double2); // 123.0

    float float3 = long2;
    System.out.println(float3);
  }
}
