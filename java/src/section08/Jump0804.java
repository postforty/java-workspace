package section08;

public class Jump0804 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();

        dog.setName("Happy");
        cat.setName("Coco");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
