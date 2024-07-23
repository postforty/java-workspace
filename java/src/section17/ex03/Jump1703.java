package section17.ex03;

import java.util.ArrayList;

class Sample implements Runnable {
    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000); // 1초
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(this.seq + " thread end.");
    }
}

public class Jump1703 {
    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Sample(i));
            t.start();
            threads.add(t);
        }

        for (int i=0; i< threads.size(); i++) {
            Thread t = threads.get(i);
            try{
                t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("main end.");
    }
}
