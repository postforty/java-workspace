package section18;

public class RunnableExampleLambda {
  public static void main(String[] args) {
    // WhiteFlag whiteFlag = new WhiteFlag();
    // Thread white = new Thread(whiteFlag);

    // 익명 클래스
    Runnable whiteFlag = new Runnable() {
      @Override
      public void run() {
        while(true) {
          System.out.println("□ 올려");
        }
      }
    };
    // Thread white = new Thread(whiteFlag);
    // white.start();

    // 람다식
    // 백기 올려
    Runnable whiteFlagLambda = () -> {
        Thread.currentThread().setName("□ 올려"); // 스레드명 변경
        String flagName = Thread.currentThread().getName();

        while(true) {
          System.out.println(flagName); // 스레드명을 출력
        }
    };
    Thread whiteLambda = new Thread(whiteFlagLambda);
    whiteLambda.start();

    // 청기 올려
    Runnable blueFlagLambda = () -> {
        while(true) {
          System.out.println("■ 올려");
        }
    };
    Thread blueLambda = new Thread(blueFlagLambda);
    blueLambda.start();
  }
}
