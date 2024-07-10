package section09;

public class Ex0903 {
    public static void main(String[] args) {
        UnclearOverloading uo = new UnclearOverloading();
        uo.printField();

        UnclearOverloading uo1 = new UnclearOverloading("JAVA", 10, 100);
        uo1.printField();

        UnclearOverloading uo2 = new UnclearOverloading(100, 10, "JAVA");
        uo2.printField();

    }
}
