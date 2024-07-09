package section07;

import java.util.Arrays;

public class Ex070601 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 1, copiedArray, 2, 3);

        // copiedArray[0] = 100;

        System.out.println("originalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copiedArray));
    }
}
