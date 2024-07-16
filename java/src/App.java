public class App {
    String name;

    class A {
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        class B {
            int number = 1;
        }

        B b = new B();
        System.out.println(b.number);

    }

    void setName(String name) {
        this.name = name;
        A a = new A();
    }
}
