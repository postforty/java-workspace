package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex1917 {
  public static void main(String[] args) {

    // 바이트 기반 스트림에서 문자 변환 보조 스트림 사용(쓰기)
    FileOutputStream fileOutputStream = null;
    OutputStreamWriter outputStreamWriter = null;

    try {
      fileOutputStream = new FileOutputStream("src/section19/example.txt");
      outputStreamWriter = new OutputStreamWriter(fileOutputStream); // 보조 스트림 추가

      System.out.println("파일 생성 시작");

      String[] strArray = {
          "OuputStreamWriter에 대해서 배웁니다.",
          "We are learning about OutputSreamWriter."
      };

      for (String str : strArray) {
        // fileOutputStream.write(str.getBytes());
        outputStreamWriter.write(str + "\n"); // 보조 스트림 이용해서 쓰기
      }

      System.out.println("파일 생성 완료");
    } catch (IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        // if (fileOutputStream != null) {
        //   fileOutputStream.close();
        // }
        if (outputStreamWriter != null) {
          outputStreamWriter.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
