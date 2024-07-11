package section10.finalexample;

class NomalClass {

}

class ChildNomalClass extends NomalClass {

}

final class FinalClass {

}

class ChildFinalClass extends FinalClass {

}


public class Ex1003 {
    public static void main(String[] args) {
        ChildNomalClass cnc = new ChildNomalClass();
        System.out.println(cnc);
    }
}
