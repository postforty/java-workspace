package section12.recipe;

public class StakeRecipe extends Recipe {
  StakeRecipe(String chef) {
    super(chef);
  }

  void grillStake() {
    System.out.println("스테이크를 맛있게 굽습니다.");
  }

  // 스테이크를 요리합니다.
  @Override
  void cook() {
    System.out.println("스테이크를 요리합니다.");
  }
}
