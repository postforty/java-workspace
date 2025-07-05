package section19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1914 {
  public static void main(String[] args) {
    // 문자 기반 스트림에서 보조 스트림 사용(읽기)
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    try {
      fileReader = new FileReader("src\\section19\\book.txt");
      bufferedReader = new BufferedReader(fileReader);

      String str = "";

      while ((str = bufferedReader.readLine()) != null) {
        System.out.println(str);
      }

    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if (fileReader != null) {
          fileReader.close();
        }
        if (bufferedReader != null) {
          bufferedReader.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
