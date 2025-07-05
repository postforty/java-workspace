package section02;

// 한줄 주석 단축키 : ctrl + /
// 코드 복사 : alt + shift + 방향키 아래로

// 파일명 생성 규칙
// - 대문자로 시작
// - 단어와 단어를 연결(조합)할때 파스칼 케이스 사용
public class ConsolePrint {
  public static void main(String[] args) {
    // print는 줄바꿈을 하지 않음
    System.out.print("Welcome.");
    System.out.print("JAVA World!");
    // 이스케이프 문자
    // System.out.print("\n"); // 줄바꿈 처리
    System.out.print("\t"); // 줄바꿈 처리
    System.out.print("Welcome.");
    System.out.print("\"JAVA\" World!");
    System.out.print("'JAVA' World!");
    System.out.print('\'');
    System.out.print("JAVA \\ World!");
  }
}
