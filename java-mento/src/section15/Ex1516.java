package section15;

import java.util.Arrays;

public class Ex1516 {
  public static void main(String[] args) {
    int[] originalScores = {85, 98, 72, 100, 96};
    int[] newScores = new int[originalScores.length];

    for (int i = 0; i < originalScores.length; i++) {
      int currentScore = originalScores[i];
      int scoreAfterAddition = currentScore + 5; // 가산점 5점 부여
      // newScores[i] = scoreAfterAddition;
      // 최대 점수가 100점이라면 오버된 점수는 100점으로 처리
      newScores[i] = Math.min(scoreAfterAddition, 100);
    }

    System.out.println(Arrays.toString(originalScores));
    System.out.println(Arrays.toString(newScores));
  }
}
