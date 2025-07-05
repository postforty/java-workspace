package section05;

public class Ex0507 {
  public static void main(String[] args) {
/*
-----*      : - 5개, * 1개
----***     : - 4개, * 3개
---*****    : - 3개, * 5개
--*******   : - 2개, * 7개
-*********  : - 1개, * 9개
*********** : - 0개, * 11개
 */

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i*2) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
