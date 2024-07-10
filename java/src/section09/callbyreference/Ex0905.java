package section09.callbyreference;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Ex0905 {
    static void modifyPerson(Person person) {
        person.name = "김이남";
        System.out.println("modifyPerson() 메서드 내 변경된 person.name\t: " + person.name);
    }
    public static void main(String[] args) {
        Person person = new Person("김일남");

        System.out.println("modifyPerson() 메서드 호출 전 person.name\t: " + person.name);

        // 객체에 의한 호출(Call by Reference)
        modifyPerson(person);

        System.out.println("modifyPerson() 메서드 호출 후 person.name\t: " + person.name);

    }
}
