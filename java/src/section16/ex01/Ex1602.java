package section16.ex01;

public class Ex1602 {
    public static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] strArray = {"A", "B", "C"};
        printArray(strArray);
    }
}
