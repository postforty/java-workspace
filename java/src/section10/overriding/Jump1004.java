package section10.overriding;


class Animal {

}

class Dog extends Animal {

}

public class Jump1004 {
    public static void main(String[] args) {
        Dog d = new Dog();

        // instanceof 연산자
        // 객체 instanceof 타입(참조)
        System.out.println("d instanceof Dog: " + (d instanceof Dog)); // 객체 d는 Dog 클래스의 인스턴스이다!
        System.out.println("d instanceof Animal: " + (d instanceof Animal)); // 객체 d는 Animal 클래스의 인스턴스이다!

        Animal a = new Animal();
        System.out.println("a instanceof Dog: " + (a instanceof Dog));
        System.out.println("a instanceof Animal: " + (a instanceof Animal));
        
        Animal ad = new Dog(); // 형변환(casting)
        System.out.println("ad instanceof Dog: " + (ad instanceof Dog));
        System.out.println("ad instanceof Animal: " + (ad instanceof Animal));

        Animal ad2 = d;
        System.out.println("ad2 instanceof Dog: " + (ad2 instanceof Dog));
        System.out.println("ad2 instanceof Animal: " + (ad2 instanceof Animal));

    }
}
