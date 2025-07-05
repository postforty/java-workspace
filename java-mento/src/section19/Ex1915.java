package section19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1915 {
  public static void main(String[] args) {
    // 문자 기반 스트림에서 보조 스트림 사용(읽고 쓰기)
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

    try {
      fileReader = new FileReader("src\\section19\\book.txt");
      bufferedReader = new BufferedReader(fileReader);
      fileWriter = new FileWriter("src\\section19\\book_copy.txt");
      bufferedWriter = new BufferedWriter(fileWriter);

      String str = "";

      while ((str = bufferedReader.readLine()) != null) {
        bufferedWriter.write(str);
        bufferedWriter.newLine();
      }

      System.out.println("텍스트 파일 복사 완료");

    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        // 보조 스트림을 close 하면 기반 스트림도 함께 close 됨!
        // if (fileReader != null) {
        //   fileReader.close();
        // }
        if (bufferedReader != null) {
          bufferedReader.close();
        }
        // 아래 코드 생략하면 새로운 파일 생성되더라도 내용(데이터) 저장이 안됨
        // if (fileWriter != null) {
        //   fileWriter.close();
        // }
        if (bufferedWriter != null) {
          bufferedWriter.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
