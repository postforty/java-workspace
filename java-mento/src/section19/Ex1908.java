package section19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex1908 {
  public static void main(String[] args) {
    int read = 0;

    Reader reader = null;

    try {
      reader = new FileReader("src\\section19\\file_korean.txt");

      while (true) {
        read = reader.read();
        if (read == -1) {
          break;
        }
        System.out.print((char) read);
      }
    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}