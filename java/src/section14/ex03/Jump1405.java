package section14.ex03;

public class Jump1405 {

    public static void shouldBeRun() {
        System.out.println("ok thanks!");
    }

    public static void main(String[] args) {
        int result;

        try {
            result = 4 / 0;
        } catch (ArithmeticException e) {
            result = 0;
        } finally {
            shouldBeRun();
        }

        System.out.println(result);
    }
}
