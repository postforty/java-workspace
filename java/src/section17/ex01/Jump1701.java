package section17.ex01;

class Sample extends Thread {
    @Override
    public void run() {
        // System.out.println("thread run.");
        System.out.println(Thread.currentThread().getName());
    }
}

public class Jump1701 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Sample sample = new Sample();
        sample.start();

        Sample sample2 = new Sample();
        sample2.start();
        sample2.setName("내 스레드-1");
    }
}
