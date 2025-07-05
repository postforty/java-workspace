package section13.practice;

class InnerExam {
  public int plus(int value) {
    class Cal {
      public int add() {
        // return value++; // 불가
        int newValue = value + 1;
        return newValue;
      }
    }

    Cal cal = new Cal();
    return cal.add();
  }
}

public class Practice1304 {
  public static void main(String[] args) {
    InnerExam ie = new InnerExam();
    System.out.println(ie.plus(1));
  }
}
