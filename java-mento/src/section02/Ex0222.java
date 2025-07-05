package section02;

public class Ex0222 {
  public static void main(String[] args) {
    // 정수 타입에서 정수 타입으로 형변환
    // byte byte1 = 10;
    // int int1 = byte1; // 자동 형변환

    int int1 = 10;
    // byte byte1 = int1; // 오류: 자동 형변환 불가
    byte byte1 = (byte) int1; // 강제 형변환

    System.out.println();

    int int2 = 128;
    byte byte2 = (byte) int2;
    System.out.println(byte2); // -128(쓰레기값 발생 주의!!!)
  }
}
