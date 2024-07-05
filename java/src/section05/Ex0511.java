package section05;

public class Ex0511 {
    public static void main(String[] args) {
        System.out.println("구구단");
        System.out.println("----------");

        for (int j = 1; j < 10; j++) {
            for (int i = 2; i < 10; i++) {
                System.out.printf("%d × %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
