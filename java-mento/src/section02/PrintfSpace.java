package section02;

public class PrintfSpace {
  public static void main(String[] args) {
    System.out.printf("%5d", 1);
    System.out.println();
    System.out.printf("%5d", 123);
    System.out.println();
    System.out.printf("%5d", 12345);
    System.out.println();
    System.out.printf("%5d", 12345789);
    System.out.println();
    System.out.printf("%05d", 1);
    System.out.println();
    System.out.printf("%05d", 12);
    System.out.println();
    System.out.printf("%05d", 123);
    System.out.println();
    System.out.printf("%-5d", 1);
    System.out.println();
    System.out.printf("%-5d", 12);
    System.out.println();
    System.out.printf("%-5d", 123);
    System.out.println();
  }
}
