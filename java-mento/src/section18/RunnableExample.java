package section18;

// Runnable 인터페이스를 구현한 방식
class WhiteFlag implements Runnable {
  @Override
  public void run() {
    while(true) {
      System.out.println("□ 올려");
    }
  }
}

public class RunnableExample {
  public static void main(String[] args) {
    // WhiteFlag whiteFlag = new WhiteFlag();
    // Thread white = new Thread(whiteFlag);

    Thread white = new Thread(new WhiteFlag());
    white.start();
  }
}
