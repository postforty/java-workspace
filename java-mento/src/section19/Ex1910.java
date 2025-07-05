package section19;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1910 {
  public static void main(String[] args) {
    FileWriter fileWriter = null;

    try {
      fileWriter = new FileWriter("src\\section19\\fileText.txt");
      fileWriter.write('H');
      fileWriter.write('A');
      fileWriter.write('P');
      fileWriter.write('P');
      fileWriter.write('Y');
      fileWriter.write('\n');
      fileWriter.write('행');
      fileWriter.write('복');
      fileWriter.write('\n');
      System.out.println("파일 생성 완료");
    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if (fileWriter != null) {
          fileWriter.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
