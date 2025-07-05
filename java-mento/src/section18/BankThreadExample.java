package section18;

class AddThread implements Runnable {
  private Bank bank;
  private String name;

  public AddThread(String name, Bank bank) {
    this.name = name;
    this.bank = bank;
  }

  @Override
  public void run() {
    // synchronized() 함수를 이용한 블럭 동기화
    synchronized(bank) {
      try {
        for(int i = 0 ; i < 10; i++) {
          Thread.sleep(1000); // 1초 멈춤
          bank.addMoney(1000);
          System.out.println(this.name + "씨가 입금함, 현재 잔고 : " + bank.getMoney());
        }
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
    }
  }
}

public class BankThreadExample {
  public static void main(String[] args) {
    // 자원(bank 객체)을 두 스레드가 공유하는 상황
    // 비동기적으로 처리
    // 경쟁 상태(Race condition) 발생
    // 동기적으로 처리해야할 필요성
    Bank bank = new Bank();
    Thread thread1 = new Thread(new AddThread("김일남", bank));
    Thread thread2 = new Thread(new AddThread("김이남", bank));

    thread1.start();
    thread2.start();
  }
}
