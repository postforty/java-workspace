package section04.practice;

public class Practice0403 {
  public static void main(String[] args) {

    // A : 90이상
    // B : 80이상
    // C : 70이상
    // D : 60이상
    // F : 60미만

    int score = 99;
    char result = 'A';


    if (score >= 90) {
      result = 'A';
    } else if (score >= 80) {
      result = 'B';
    } else if (score >= 70) {
      result = 'C';
    } else if (score >= 60) {
      result = 'D';
    } else {
      result = 'F';
    }

    System.out.printf("%d점의 학점은 %s입니다.\n", score, result);
  }
}
