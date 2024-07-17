package section13.practice.p02;

class OuterStatic {
    private static String message = "Hello, static inner class!";

    static class InnerStatic {
        void display() {
            System.out.println(message);
        }
    }
}

public class Practice1302 {
    public static void main(String[] args) {
        OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
        inner.display();
    }
}
