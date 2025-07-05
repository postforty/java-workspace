package section05.practice;

public class Practice0506 {
  public static void main(String[] args) {

    // ------*-        : -- 3개, *- 1개
    // ----*-*-*-      : -- 2개, *- 3개
    // --*-*-*-*-*-    : -- 1개, *- 5개
    // *-*-*-*-*-*-*-  : -- 0개, *- 7개

    for (int i = 0; i < 4; i++) {
      for (int j = 3 - i; j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = 0; j < (2*i+1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
