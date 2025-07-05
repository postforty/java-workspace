package section19.practice;

import java.io.FileInputStream;

public class Practice1904 {
  public static void main(String[] args) {
    FileInputStream in = null;

    try {
      in = new FileInputStream("src\\section19\\practice\\read.txt");
      int read = 0;

      while(read != 0) {
        read = in.read();
        System.out.println((char)read);
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (in != null) {
          in.close();
        } 
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}
