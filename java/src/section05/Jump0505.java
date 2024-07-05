package section05;

public class Jump0505 {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three" };

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // for each는 반복 가능한 객체(iterable object)에서 사용 가능
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}
