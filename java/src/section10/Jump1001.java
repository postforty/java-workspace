package section10;

public class Jump1001 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("비밀");
        System.out.println(a.name);

        Dog d = new Dog();// 객체명, 참조 변수
        d.setName("happy");
        // System.out.println(d.name);
        d.sleep();

    }
}
