package section17;

interface CompareNumber {
  int compareTo(int num01, int num02);
}

public class CompareMain {
  public static void main(String[] args) {
    // 익명 클래스
    CompareNumber compare = new CompareNumber() {
      @Override
      public int compareTo(int num01, int num02) {
        return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
      }
    };

    int num01 = 10;
    int num02 = 20;

    int result = compare.compareTo(num01, num02);

    System.out.println(result);

    if(result > 0) {
      System.out.println("num01이 num02 보다 크다.");
    } else if (result < 0) {
      System.out.println("num01이 num02 보다 작다.");
    } else {
      System.out.println("num01과 num02 같다.");
    }
  }
}
