package section06;

import java.util.Arrays;

public class Ex0616 {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];

    int num = 1;

    for(int i=0; i < arr.length; i++) {
      for(int j=0; j < arr[0].length; j++) {
        arr[i][j] = num++;
        // num++;
      }
    }

    for(int i=0; i < arr.length; i++) {
      for(int j=0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
