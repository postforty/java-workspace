package section06;

import java.util.Arrays;

public class Ex0615 {
  public static void main(String[] args) {
    int[][] arr = new int[3][];

    System.out.println(Arrays.toString(arr)); // [null, null, null]

    arr[0] = new int[2];
    arr[1] = new int[3];
    arr[2] = new int[1];
    // arr[0] = new int[] {1, 2};
    // arr[1] = new int[] {1, 2, 3};
    // arr[2] = new int[] {1};

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println(Arrays.toString(arr[0]));
    System.out.println(Arrays.toString(arr[1]));
    System.out.println(Arrays.toString(arr[2]));

    int[][] arr2 = new int[3][5];

    System.out.println(Arrays.toString(arr2[0]));
    System.out.println(Arrays.toString(arr2[1]));
    System.out.println(Arrays.toString(arr2[2]));

    System.out.println();

    arr2[0][1] = 1;
    arr2[0][3] = 3;

    arr2[2][2] = 2;
    arr2[2][4] = 4;

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(Arrays.toString(arr2[i]));
    }
  }
}
