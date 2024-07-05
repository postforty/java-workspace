package section07;

public class Ex0701 {
    public static void main(String[] args) {
        int[] oddArr = {1, 3, 5, 7, 9, 11};
        int evenArr[] = {2, 4, 6, 8, 10};

        System.out.println("oddArr\t\t: " + oddArr);

        /*
         * [ 배열
         * I 정수형(int)
         * @
         * 2f92e0f4 배열 객체 해시코드(16진수 표현)
         */

        System.out.println(oddArr[0]);
        System.out.println(oddArr[1]);
        System.out.println(oddArr[2]);
        System.out.println(oddArr[3]);
        System.out.println(oddArr[4]);
        // System.out.println(oddArr[5]); // ArrayIndexOutOfBoundsException

        System.out.println("oddArr.length\t: " + oddArr.length);

        for(int i = 0; i < oddArr.length; i++) {
            System.out.printf("%d ", oddArr[i]);
        }
    }
}
