package section18;

// Thread 클래스 상속 방식
class MyThread extends Thread {
  @Override
  public void run() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      sum += i;
    }

    System.out.println("sum = " + sum);

    // 스레드 명 확인하기
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName);
  }
}

public class SumMain {
  public static void main(String[] args) {
    // 스레드 명 확인하기
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName);

    MyThread myThread = new MyThread();
    myThread.start();

    MyThread yourThread = new MyThread();
    yourThread.start();
  }
}
