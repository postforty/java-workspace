package section11.practice.p03;

/*

아래와 같이 출력되도록 코드를 완성하시오!
Printing: Document1.pdf
Scanning: Document2.pdf
Faxing: Document3.pdf

 */

interface Printable {
    abstract void print(String document);
}

interface Scannable {
    abstract void scan(String document);
}

interface MultiFunctionDevice extends Printable, Scannable {
    abstract void fax(String document);
}

class MultiFunctionPrinter implements MultiFunctionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
    @Override
    public void fax(String document) {
        System.out.println("faxing: " + document);
    }
}

public class Practice03 {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
        mfp.fax("Document3.pdf");
    }
}
