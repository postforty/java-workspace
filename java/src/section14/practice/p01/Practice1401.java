package section14.practice.p01;

public class Practice1401 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 범위를 초과했습니다.");
        } finally {
            System.out.println("종료");
        }
    }
}
