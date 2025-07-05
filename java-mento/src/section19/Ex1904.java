package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class Ex1904 {
  public static void main(String[] args) {
    OutputStream out = null;

    try {
      out = new FileOutputStream("src/section19/write.txt", false);

      String str = "hello world";

      byte[] strArray = str.getBytes();

      System.out.println(Arrays.toString(strArray));

      out.write(strArray);
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(out != null) {
          out.close();
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}
