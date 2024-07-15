package section11.practice.p02;

/*

아래와 같이 출력되도록 코드를 완성하시오!
Printing: Document1.pdf
Scanning: Document2.pdf

 */

interface Printable {
    abstract void print(String document);
}

interface Scannable {
    abstract void scan(String document);
}

class MultiFunctionPrinter implements Printable, Scannable {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}

public class Practice02 {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
    }
}
