package section14.ex03;

public class Ex1405 {
    public static void main(String[] args) {

        try {
            // int result = 4 / 0;
            // System.out.println(result);

            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);

        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
