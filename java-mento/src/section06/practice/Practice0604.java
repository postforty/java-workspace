package section06.practice;

public class Practice0604 {
  public static void main(String[] args) {
    int[][] mabang = new int[5][5];
    int number = 1;

    int nextRow = 0;
    int nextCol = 2;
    mabang[nextRow][nextCol] = number++;

    while (number <= 25) {
      // 오른쪽 대각선 위로 한칸 이동
      nextRow--;
      nextCol++;

      if (nextRow < 0 && nextCol < 5) {
        nextRow = 4;
      }

      if (nextRow >= 0 && nextCol == 5) {
        nextCol = 0;
      }

      if (nextCol == 5 && nextRow < 0) {
        nextRow += 2;
        nextCol -= 1;
      }

      if (mabang[nextRow][nextCol] != 0) {
        nextRow += 2;
        nextCol -= 1;
      }

      mabang[nextRow][nextCol] = number++;
    }

    for (int i = 0; i < mabang.length; i++) {
      for (int j = 0; j < mabang[i].length; j++) {
        System.out.print(mabang[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
