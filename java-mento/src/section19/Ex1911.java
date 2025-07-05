package section19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1911 {
  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    BufferedInputStream bufferedInputStream = null;

    int read = 0;

    try {
      fileInputStream = new FileInputStream("src\\section19\\fileText.txt");
      bufferedInputStream = new BufferedInputStream(fileInputStream); // 보조 스트림 사용 방법

      while((read = bufferedInputStream.read()) != -1) {
        System.out.print((char)read);
      }
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
