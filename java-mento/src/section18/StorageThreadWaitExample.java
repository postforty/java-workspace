package section18;

class AddStackThread extends Thread {
  private Storage storage;

  public AddStackThread(Storage storage) {
    this.storage = storage;
  }

  @Override
  public void run() {
    try {
      while(true) {
        Thread.sleep(1000);
        if(this.storage.getStackCount() == 0) {
          System.out.println("짐 10개 추가");
          this.storage.addStack(10);
        }
      }
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class PopStackThread extends Thread {
  private Storage storage;

  public PopStackThread(Storage storage) {
    this.storage = storage;
  }

  @Override
  public void run() {
    try {
      while(true) {
        Thread.sleep(1000);
        System.out.println("짐 5개 나르기");
        this.storage.popStack(5);
      }
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class StorageThreadWaitExample {
  public static void main(String[] args) {
    Storage storage = new Storage();
    
    AddStackThread addStackThread = new AddStackThread(storage);
    PopStackThread popStackThread = new PopStackThread(storage);

    addStackThread.start();
    popStackThread.start();
  }
}
