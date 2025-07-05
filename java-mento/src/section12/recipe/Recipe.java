package section12.recipe;

// 추상 클래스
abstract public class Recipe {
  String chef;

  Recipe(String chef) {
    this.chef = chef;
  }

  void info() {
    System.out.println("이 레시피는 " + chef + " 셰프님의 레시피입니다.");
  }

  abstract void cook(); // 추상 메서드
}
