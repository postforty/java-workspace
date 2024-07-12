package section10.singleton;

public class Jump1011 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getNewInstance();
        System.out.println(singleton1);
        Singleton singleton2 = Singleton.getNewInstance();
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2); // false

        System.out.println();

        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        System.out.println(singleton3);
        System.out.println(singleton4);
        System.out.println(singleton3 == singleton4);

    }
}
