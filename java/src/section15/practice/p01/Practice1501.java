package section15.practice.p01;

/*
    toString() 메서드를 오버라이드하세요.
    이름과 나이를 출력하도록 작성하세요.
    
    Person{name='김일남', age=99}
    
    */

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Practice1501 {
    public static void main(String[] args) {
        Person person = new Person("김일남", 99);
        System.out.println(person.toString());
    }
}
