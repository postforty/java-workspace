package section17.ex04;

class Counter {
    private int count;

    public int getCount() {
        return this.count;
    }

    public void setCount() {
        this.count++;
    }

    // public synchronized void setCount() {
    //     this.count++;
    // }
}

class Sample extends Thread {
    private Counter counter;
    int seq;

    public Sample(int seq, Counter counter) {
        this.seq = seq;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); // 1초
                    counter.setCount();
                    System.out.println(this.seq + "thread add count " + counter.getCount());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex1701 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Sample sample1 = new Sample(1, counter);
        Sample sample2 = new Sample(2, counter);
        sample1.start();
        sample2.start();
    }
}
