package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex1907 {
  public static void main(String[] args) {
    int read = 0;
    
    InputStream inputStream = null;

    try {
      inputStream = new FileInputStream("src\\section19\\file_korean.txt");

      while (true) {
        read = inputStream.read();
        if(read == -1) {
          break;
        }
        System.out.print((char)read);
      }
    } catch(IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if(inputStream != null) {
          inputStream.close();
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}
