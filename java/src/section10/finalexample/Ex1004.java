package section10.finalexample;

class NomalMethod {
    void nomalMethod() {
        System.out.println("nomalMethod!");
    }
}

class ChildNomalMethod extends NomalMethod {
    @Override
    void nomalMethod() {
        System.out.println("ChildNomalMethod.nomalMethod!");
    }
}

class FinalMethod {
    final void finalMethod() {
        System.out.println("nomalMethod!");
    }
}

class ChildFinalMethod extends FinalMethod {
    @Override
    void finalMethod() {
        System.out.println("ChildFinalMethod.nomalMethod!");
    }
}

public class Ex1004 {
    public static void main(String[] args) {
        ChildNomalMethod cnm = new ChildNomalMethod();
        cnm.nomalMethod();
    }
}
