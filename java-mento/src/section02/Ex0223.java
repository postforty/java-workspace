package section02;

public class Ex0223 {
  public static void main(String[] args) {
    // 실수에서 실수로 형변환
    // float float1 = 1.123f;
    // double double1 = float1; // 자동 형변환

    double double1 = 1.123;
    float float1 = (float) double1; // 강제 형변환

    double double2 = 1.0e100;
    float float2 = (float) double2; 
    System.out.println(float2);// Infinity(float 표현 범위를 넘어가면)

    double double3 = 1.0e-100;
    float float3 = (float) double3; 
    System.out.println(float3);// 0.0(최소 float 표현 범위를 넘어가면)
  }
}
