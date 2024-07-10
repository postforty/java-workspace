package section08;

public class Ex0804 {
    public static void main(String[] args) {
        Person kim1 = new Person();
        Person kim2 = new Person();

        kim1.name = "김일남";
        kim1.age = 99;
        kim1.country = "한국";

        kim2.name = "김이남";
        kim2.age = 98;
        kim2.country = "한국";

        System.out.printf("%s %d세(%s)\n", kim1.name, kim1.age, kim1.country);
        System.out.printf("%s %d세(%s)\n", kim2.name, kim2.age, kim2.country);
    }
}
