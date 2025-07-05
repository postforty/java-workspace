package section19;

import java.io.File;
import java.io.IOException;

public class Ex1918 {
  public static void main(String[] args) {
    // File 클래스 : 파일의 경로명, 파일 크기, 타입, 날짜, 경로등 속성 정보 제공
    File file = new File("src\\section19\\book.txt"); // 존재하는 파일
    // File file = new File("src\\section19\\example_copy.txt"); // 존재하지 않는 파일

    System.out.println(file.exists()); // true

    if (file.exists()) {

      System.out.println("length : " + file.length());
      System.out.println("canRead : " + file.canRead());
      System.out.println("canWrite : " + file.canWrite());
      System.out.println("getAbsolutePath : " + file.getAbsolutePath());

      // 정규화된 절대 경로 반환
      // try {
      //   System.out.println("getCanonicalPath : " + file.getCanonicalPath());
      // } catch (IOException e) {
      //   e.printStackTrace();
      // }

      System.out.println("getName : " + file.getName()); // 파일명
      System.out.println("getPath : " + file.getPath()); // 상대 경로(파일명 포함)
      System.out.println("getParent : " + file.getParent()); // 상대 경로(파일명 미포함)
    }
  }
}
