package section13.ex01_instance;

class Outer {
    private String outerField = "Outer field";

    class Inner {
        String innerField = "Inner field";

        void display() {
            System.out.println(outerField);
        }
    }

    void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

public class Ex1301 {
    public static void main(String[] args) {
        Outer outer1 = new Outer();
        Outer.Inner inner = outer1.new Inner();
        inner.display();
        System.out.println(inner.innerField);

        outer1.createInner();
    }
}
