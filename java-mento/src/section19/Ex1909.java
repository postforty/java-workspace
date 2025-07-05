package section19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex1909 {
  public static void main(String[] args) {
    int read = 0;

    Reader reader = null;

    try {
      reader = new FileReader("src\\section19\\file_korean.txt");
      // reader = new FileReader("src\\section19\\java.zip"); // 바이트 기반 파일의 경우 효과적이지 않음
      
      char[] buffer = new char[256];

      while (true) {
        read = reader.read(buffer);
        if (read == -1) {
          break;
        }
        // System.out.println(new String(buffer, 0, read));
        System.out.println(String.valueOf(buffer, 0, read));
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