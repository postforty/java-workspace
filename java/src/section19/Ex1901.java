package section19;

import java.util.Arrays;

public class Ex1901 {
    static int[] gugu(int dan) {
        int[] result = new int[9];
        // System.out.println(Arrays.toString(result));
        result[0] = dan * 1;
        result[1] = dan * 2;
        result[2] = dan * 3;
        result[3] = dan * 4;
        result[4] = dan * 5;
        result[5] = dan * 6;
        result[6] = dan * 7;
        result[7] = dan * 8;
        result[8] = dan * 9;
        return result;
    }
    public static void main(String[] args) {
        int dan = 2;
        int[] result = gugu(dan);

        // System.out.println(Arrays.toString(result));

        int num = 1;
        for(int n:result) {
            System.out.printf("%d * %d = %d\n", dan, num, n);
            num++;
        }
    }
}
