package section14.ex03;

public class Jump1404 {
    public static void main(String[] args) {
        int result;

        try {
            result = 4 / 0;
        } catch(ArithmeticException e) {
            result = 0;
        }
        
        System.out.println(result);
    }
}
