package section08;

public class Ex0805 {
    public static void main(String[] args) {
        Person.staticCountry = "한국";

        Person kim1 = new Person();
        Person kim2 = new Person();
        Person kim3 = new Person();

        kim1.name = "김일남";
        kim1.age = 99;
        // kim1.country = "한국";

        kim2.name = "김이남";
        kim2.age = 98;
        // kim2.country = "한국";

        kim3.name = "김삼남";
        kim3.age = 97;

        System.out.printf("%s %d세(%s)\n", kim1.name, kim1.age, Person.staticCountry);
        System.out.printf("%s %d세(%s)\n", kim2.name, kim2.age, Person.staticCountry);
        System.out.printf("%s %d세(%s)\n", kim3.name, kim3.age, Person.staticCountry);
    }
}
