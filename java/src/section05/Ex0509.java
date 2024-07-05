package section05;

public class Ex0509 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.printf("%d ", i);
        }
    }
}
