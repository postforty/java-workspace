package section19;

public class Ex1902 {
    public static void main(String[] args) {
        int result = 0;
        int n = 1;
        while (n < 1000) {
            if (n % 3 == 0 || n % 5 == 0) {
                // System.out.println(n);
                result += n;
            }
            n++;
        }
        System.out.println(result);
    }
}
