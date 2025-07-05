package section05;

public class Ex0504 {
  public static void main(String[] args) {
    
    // i(index)
    // i, j, k, m, n...
    for (int i=0; i<3; i++) {
      System.out.printf("--- %d번째 바깥쪽 for ---\n", i+1);

      for (int j = 0; j < 5; j++) {
        System.out.printf("%d번째 안쪽 for!\n", j+1);
      }
    }
  }
}
