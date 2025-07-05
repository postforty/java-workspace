package section18.practice;

class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <=5 ; i++) {
      System.out.println(i + "초");
    }
  }
}

public class Practice1803 {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
  }
}
