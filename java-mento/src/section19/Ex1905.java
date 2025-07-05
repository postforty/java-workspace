package section19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1905 {
  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;

    String path = "src\\section19\\java.zip";
    String copyPath = "src\\section19\\java_copy.zip";

    try {
      // fileInputStream = new FileInputStream("src\\section19\\cat.jpg");
      // fileOutputStream = new FileOutputStream("src\\section19\\cat_copy.jpg");
      fileInputStream = new FileInputStream(path);
      fileOutputStream = new FileOutputStream(copyPath);

      long start = System.currentTimeMillis();

      int read = 0;

      // while(read != -1) {
      //   read = fileInputStream.read(); // 파일 읽어 오기
      //   fileOutputStream.write(read); // 파일 쓰기
      // }
      while((read = fileInputStream.read()) != -1) {
        fileOutputStream.write(read);
      }

      long end = System.currentTimeMillis();
      long time = (end - start) / 1000;
      System.out.println(time + "초");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fileInputStream != null) {
          fileInputStream.close();
        }
        if (fileOutputStream != null) {
          fileOutputStream.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
