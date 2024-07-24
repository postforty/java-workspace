package section18.ex01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Jump1801 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("out.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\n";
            output.write(data.getBytes());
        }

        output.close();

    }
}
