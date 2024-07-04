package section05;

public class Ex0503 {
    public static void main(String[] args) {
        // 1~10 짝수 출력
        int number = 1;
        while(number <= 10) {
            if (number % 2 == 0) {
                System.out.printf("%d ", number);
            }
            number++;
        }
    }
}
