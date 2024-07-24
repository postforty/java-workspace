package section18.ex04;

import java.io.FileReader;
import java.io.IOException;

public class Ex1808 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("out2.txt");

        int read;

        while (true) {
            read = reader.read();
            if (read == -1) {
                break;
            }
            System.out.print((char) read);
        }

        reader.close();
    }
}
