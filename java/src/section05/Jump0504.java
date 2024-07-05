package section05;

public class Jump0504 {
    public static void main(String[] args) {
        // 변수명 작명 순서 : i j k m n
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");

            for (int j = 1; j < 10; j++) {
                System.out.println(i + "×" + j + "=" + (i * j)); // win + .
            }
            
            System.out.println();
        }
    }
}
