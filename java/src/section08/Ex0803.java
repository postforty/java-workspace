package section08;

public class Ex0803 {
    int sumFromOneToTen() {
        int sum = 0;
        int number = 1;
        while(true) {
            sum += number;
            number++;
            if(number > 10) {
                return sum;
            }
        }
    }

    public static void main(String[] args) {
        Ex0803 sum = new Ex0803();
        int result = sum.sumFromOneToTen();
        System.out.println(result);
    }
}
