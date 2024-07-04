package section05;

public class Ex0512 {
    public static void main(String[] args) {
        do {
            System.out.println("최초 한 번 실행 후 조건식이 true면 반복");
        } while (false);

        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println(sum);
    }
}
