package section02;

public class Ex0210 {
  public static void main(String[] args) {
    // Swap 알고리즘
    int myAge = 20;
    int yourAge = 30;
    int tempAge;

    tempAge = myAge;
    myAge = yourAge;
    yourAge = tempAge;

    System.out.println("myAge: " + myAge);
    System.out.println("yourAge: " + yourAge);
  }
}
