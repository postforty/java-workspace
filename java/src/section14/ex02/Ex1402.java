package section14.ex02;

public class Ex1402 {
    public static void main(String[] args) {
        String numberString = "123abc";

        int number = Integer.parseInt(numberString); // NumberFormatException
        System.out.println(number + number);
    }
}
