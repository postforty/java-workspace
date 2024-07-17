package section13.practice.p03;

class OuterLocal {
    void display() {
        String localMessage = "Hello, local inner class!";

        class LocalInner {
            void print() {
                System.out.println(localMessage);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.print();
    }
}

public class Practice1303 {
    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.display();
    }
}
