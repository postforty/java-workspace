package section02;

// 코드 삭제 단축키 : ctrl + shift + k

public class ConsolePrintf {
  public static void main(String[] args) {
    // %는 서식문자
    System.out.printf("저는 대학교 %d학년에 재학중입니다.", 1);
    System.out.println();
    System.out.printf("제 성적은 %f입니다.\n", 4.5);
    System.out.printf("저는 지금 %s를 공부하고 있습니다.", "JAVA");
    System.out.printf("%s는 %c로 시작합니다.", "JAVA", 'J');
    System.out.printf("%%s는 %s와 같이 모든 데이터형을 처리할 수 있습니다.", 4.5);
  }
}
