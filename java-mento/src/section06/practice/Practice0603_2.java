package section06.practice;

import java.util.Random;

public class Practice0603_2 {
    public static void shuffleArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        System.out.println("Shuffled array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        shuffleArray();
    }
}
