package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1913 {
  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    FileInputStream bisFileInputStream = null;
    BufferedInputStream bufferedInputStream = null;

    FileOutputStream fileOutputStream = null;
    BufferedOutputStream bufferedOutputStream = null;

    int read = 0;

    try {
      System.out.println("보조 스트림으로 복사 시작");
      long start = System.currentTimeMillis();

      bisFileInputStream = new FileInputStream("src\\section19\\java.zip");
      bufferedInputStream = new BufferedInputStream(bisFileInputStream);

      fileOutputStream = new FileOutputStream("src\\section19\\java_copy.zip");
      bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

      while((read = bufferedInputStream.read()) != -1) {
        bufferedOutputStream.write(read);
      }
      
      long end = System.currentTimeMillis();
      long time = (end - start);
      System.out.println("보조 스트림으로 복사 종료: " + time + "밀리초");

    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if (fileInputStream != null) {
          fileInputStream.close();
        }
        if (bufferedInputStream != null) {
          bufferedInputStream.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }
}
