package section18;

class TimeThread extends Thread {
  @Override
  public void run() {
    for(int i=1;i<=100; i++) {
      System.out.println("스레드 출력 " + i);

      // Timed_waiting 처리
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {
        System.out.println("sleep error");
      }
    }
  }
}

public class ThreadSleepExample {
  public static void main(String[] args) {
    TimeThread timeThread = new TimeThread();
    timeThread.start();
  }
}
