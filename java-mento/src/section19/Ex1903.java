package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex1903 {
  public static void main(String[] args) {
    OutputStream out = null;

    try {
      out = new FileOutputStream("src/section19/write.txt", false); // 데이터 추가 옵션 기본값은 false(생략 가능)
      out.write('H');
      out.write('E');
      out.write('L');
      out.write('L');
      out.write('O');
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
