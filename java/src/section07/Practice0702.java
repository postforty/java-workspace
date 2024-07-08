package section07;

public class Practice0702 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        int sum = 0;

        for(int number: numbers) {
            sum += number;
        }
        System.out.print("배열 요소 합: " + sum);
    }
}
