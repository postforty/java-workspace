package section18;

public class Ex1801 {
  public static void main(String[] args) {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName); // main

    System.out.println("---");

    // 스레드명 변경하기
    Thread.currentThread().setName("NewThread");
    threadName = Thread.currentThread().getName();
    System.out.println(threadName);
  }
}
