package section19.practice;

import java.io.FileWriter;
import java.util.Scanner;

public class Practice1905 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FileWriter writer = null;

    try {
      String str = "";

      writer = new FileWriter("src\\section19\\practice\\write.txt");

      System.out.print("키보드 입력 : ");

      while (true) {
        str = scanner.next();
        if(str.equals("END")) {
          break;
        }
        writer.write(str);
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (writer != null) {
          writer.close();
        }

        if (scanner != null) {
          scanner.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
