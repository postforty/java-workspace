package section15.ex03;

class Person implements Cloneable {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Ex1507 {
    public static void main(String[] args) {
        try {
            Person original = new Person("김일남", 99);
            Person clone = (Person) original.clone();
            System.out.println("original\t: " + original);
            System.out.println("clone\t\t: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
