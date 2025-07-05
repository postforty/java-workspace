package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex1901 {
  public static void main(String[] args) {
    int read = 0;
    // String path = "C:\\wsh\\java-workspace\\java\\src\\section19\\my_file.txt"; // 절대 경로
    // String path = "C:/wsh/java-workspace/java/src/section19/my_file.txt"; // 절대 경로
    String path = "src/section19/my_file.txt"; // 상대 경로

    InputStream inputStream = null;

    try {
      inputStream = new FileInputStream(path);

      while (true) {
        read = inputStream.read(); // 1byte씩 읽기
        if(read == -1) {
          break;
        }
        System.out.print((char)read);
      }
    } catch(IOException e) {
      System.out.println("Error : " + e.getMessage());
    } finally {
      try {
        if(inputStream != null) {
          inputStream.close();
        }
      } catch(Exception e) {
        e.printStackTrace(); // 예외 발생 당시의 호출 스택에 있던 메서드 정보와 예외 결과 출력
      }
    }

  }
}
