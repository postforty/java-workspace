package section10._final;

public class Ex1027 {
  public static void main(String[] args) {
    final double PI = 3.14; // final은 상수를 정의함, 상수명 일반적 대문자 스네이크 케이스(UPPER_SNAKE_CASE)로 작명
    // PI = 3.141592; // pi는 상수 이기 때문에 값을 변경할 수 없음

    System.out.println(PI);

    Comic comic = new Comic("포켓몬","김일남", true);
    comic.infoTitle();
  }
}
