package section15.ex01;

class Person extends Object{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}

public class Ex1502 {
    public static void main(String[] args) {
        Person person = new Person("김일남", 99);
        System.out.println(person.toString());
    }
}
