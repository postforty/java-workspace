package section05;

public class Ex0505 {
    public static void main(String[] args) {
        // 1~10 짝수 출력(refactoring)
        int number = 1;
        while(true) {
            number++;
            if (number % 2 != 0) {
                continue;
            }
            System.out.printf("%d ", number);
            if (number >= 10) {
                break;
            }
        }
    }
}
