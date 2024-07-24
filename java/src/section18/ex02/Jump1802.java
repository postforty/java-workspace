package section18.ex02;

import java.io.FileWriter;
import java.io.IOException;

public class Jump1802 {
    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("out2.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\n";
            output.write(data);
        }

        output.close();

        FileWriter output2 = new FileWriter("out2.txt", true);

        for (int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.\n";
            output2.write(data);
        }

        output2.close();

    }
}
