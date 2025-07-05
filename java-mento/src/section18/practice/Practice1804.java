package section18.practice;

class MyRunnable implements Runnable {
  @Override
  public void run() {
    for(int i = 1; i <=5; i++) {
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(i + "초");
    }
  }
}

public class Practice1804 {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
  }
}
