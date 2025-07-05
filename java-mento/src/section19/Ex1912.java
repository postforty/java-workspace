package section19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1912 {
  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    FileInputStream bisFileInputStream = null;
    BufferedInputStream bufferedInputStream = null;

    try {
      System.out.println("기본 스트림으로 읽기 시작");
      fileInputStream = new FileInputStream("src\\section19\\java.zip");
      
      long start = System.currentTimeMillis();
      System.out.println("읽기 시작");
      while(fileInputStream.read() != -1) {
      }
      System.out.println("읽기 종료");
      long end = System.currentTimeMillis();
      long time = (end - start);
      System.out.println("기본 스트림으로 읽기 종료: " + time + "밀리초");
      
      System.out.println("보조 스트림으로 읽기 시작");
      start = System.currentTimeMillis();
      System.out.println("읽기 시작");
      bisFileInputStream = new FileInputStream("src\\section19\\java.zip");
      bufferedInputStream = new BufferedInputStream(bisFileInputStream);
      while(bufferedInputStream.read() != -1) {
      }
      end = System.currentTimeMillis();
      time = (end - start);
      System.out.println("보조 스트림으로 읽기 종료: " + time + "밀리초");

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
