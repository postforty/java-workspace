package section12.recipe;

public class PastaRecipe extends Recipe {
  PastaRecipe(String chef) {
    super(chef);
  }

  void makeSource() {
    System.out.println("파스타 소스를 직접 만듭니다.");
  }

  // 부모 클래스의 추상 메서드가 구현을 강제하므로 반드시 구현해야 함.
  @Override
  void cook() {
    System.out.println("파스타를 요리합니다.");
  }
}
