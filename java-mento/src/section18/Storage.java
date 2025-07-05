package section18;

public class Storage {
  private int stackCount = 10;

  public synchronized void addStack(int stackCount) {
    this.stackCount += stackCount;

    if (this.stackCount >= 10) {
      System.out.println("--- 스레드 깨우기 ---");
      notify();
    }
  }

  public synchronized void popStack(int leaveCount) {
    try {
      if (leaveCount > this.stackCount) {
        this.stackCount = 0;
      } else {
        this.stackCount -= leaveCount;
      }
  
      if(this.stackCount == 0) {
        System.out.println("--- 짐 없음, 대기 하세요! ---");
        wait();
        System.out.println("--- 짐 없음 완료 ---");
      }
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getStackCount() {
    return this.stackCount;
  }
}
