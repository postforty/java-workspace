package section05.practice;

public class Practice0504 {
  public static void main(String[] args) {
    int count = 1;
    
    while (true) {
      int dice1 = (int)(Math.random() * 6) + 1;
      int dice2 = (int)(Math.random() * 6) + 1;

      if (dice1 == dice2) {
        System.out.println("반복 횟수: " + count);
        System.out.println("주사위 눈: " + dice1);
        break;
      }
      
      count++;
    }
  }
}
