package section02;

public class Ex0213 {
  public static void main(String[] args) {
    // 기본 타입: 정수
    byte num1 = 20; // 1byte(-128~127)
    short num2 = 30; // 2byte(2^16)
    int num3 = 40; // 4byte(2^32)
    long num4 = 50; // 8byte(2^64)
    
    System.out.println("byte: " + num1);
    System.out.println("short: " + num2);
    System.out.println("int: " + num3);
    System.out.println("long: " + num4);

    System.out.println();
    
    num1 = 0110; // 8진수(0으로 시작하는 숫자)
    num2 = 0x46; // 16진수(0x로 시작하는 숫자) 
    num3 = 0b101; // 2진수(0b로 시작하는 숫자) 
    num4 = 50L; // long 타입의 50
    
    System.out.println("byte: " + num1);
    System.out.println("short: " + num2);
    System.out.println("int: " + num3);
    System.out.println("long: " + num4);
  }
}
