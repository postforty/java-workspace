package section11.practice.p01;

/*

아래와 같이 출력되도록 코드를 완성하시오!
Printing: Document1.pdf
Scanning: Document2.pdf

 */

abstract class Printable {
    abstract void print(String document);
}

abstract class Scannable {
    abstract void scan(String document);
}

class SamsungPrinter extends Printable{
    @Override
    void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class SamsungScanner extends Scannable{
    @Override
    void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}

public class Practice01 {
    public static void main(String[] args) {
        SamsungPrinter sp = new SamsungPrinter();
        SamsungScanner ss = new SamsungScanner();

        sp.print("Document1.pdf");
        ss.scan("Document2.pdf");
    }
}
