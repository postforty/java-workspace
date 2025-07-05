package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex1902 {
  public static void main(String[] args) {
    int read = 0;

    InputStream inputStream = null;

    byte[] buffer = new byte[5];

    try {
      inputStream = new FileInputStream("C:\\wsh\\java-workspace\\java\\src\\section19\\my_file.txt");
      while(true) {
        read = inputStream.read(buffer);

        if (read == -1) {
          break;
        }

        // System.out.print(buffer);
        System.out.print(new String(buffer, 0, read));
      }
    } catch(IOException e) {
      e.printStackTrace();
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
