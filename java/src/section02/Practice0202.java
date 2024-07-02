package section02;

public class Practice0202 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp;

        // swap
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x); // x: 10
        System.out.println("y: " + y); // y: 5
    }
}
