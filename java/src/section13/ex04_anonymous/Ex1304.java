package section13.ex04_anonymous;

interface Greeting {
    void greet();
}

public class Ex1304 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, anonymous inner class!");
            }
        };
        greeting.greet();

    }
}
