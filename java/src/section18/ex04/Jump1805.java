package section18.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jump1805 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("out2.txt");
        BufferedReader br = new BufferedReader(reader);

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }

        reader.close();
    }
}
