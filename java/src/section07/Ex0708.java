package section07;

import java.util.Arrays;

public class Ex0708 {
    public static void main(String[] args) {
        int[][] arrs = new int[3][4];

        int index = 0;
        for(int[] arr: arrs) {
            System.out.println("index " + index + " : " + Arrays.toString(arr));
            index++;
        }

        System.out.println();
        System.out.println("다차원 배열 깊은 복사시 주의!!!");

        int[][] copiedArrs = Arrays.copyOf(arrs, arrs.length);

        arrs[0][0] = 100;

        System.out.println();

        index = 0;
        for(int[] arr: arrs) {
            System.out.println("index " + index + " : " + Arrays.toString(arr));
            index++;
        }

        System.out.println();

        index = 0;
        for(int[] arr: copiedArrs) {
            System.out.println("index " + index + " : " + Arrays.toString(arr));
            index++;
        }
    }
}
