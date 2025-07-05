package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1916 {
  public static void main(String[] args) {
    // 바이트 기반 스트림에서 문자 변환 보조 스트림 사용(읽기)
    FileInputStream fileInputStream = null;
    InputStreamReader inputStreamReader = null;

    try {
      fileInputStream = new FileInputStream("src\\section19\\fileText.txt");
      inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");

      int read = 0;

      while((read = inputStreamReader.read()) != -1) {
        System.out.print((char)read);
      }
    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if (fileInputStream != null) {
          fileInputStream.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
