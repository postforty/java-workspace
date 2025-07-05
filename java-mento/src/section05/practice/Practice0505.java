package section05.practice;

public class Practice0505 {
  public static void main(String[] args) {

    // ---*- : - 3개, *- 1개
    // --*-*- : - 2개, *- 2개
    // -*-*-*- : - 1개, *- 3개
    // *-*-*-*- : - 0개, *- 4개

    for (int i = 0; i < 4; i++) {
      for (int j = 3 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
