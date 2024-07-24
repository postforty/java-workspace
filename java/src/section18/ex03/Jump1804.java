package section18.ex03;

import java.io.FileInputStream;
import java.io.IOException;

public class Jump1804 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1023];
        FileInputStream input = new FileInputStream("out.txt");

        input.read(b);

        System.out.println(new String(b));
        input.close();
    }
}
