package section08.parameter;

public class MidTerm {
  int score(int[] scores) {
    int result = 0;

    for (int score : scores) {
      result += score;
    }
    
    return result;
  }
}
