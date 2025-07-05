package section12.recipe;

public class Ex1204 {
  public static void main(String[] args) {
    // Recipe recipe = new Recipe("김일남"); // 객체 생성 불가
    // recipe.info();

    PastaRecipe pastaRecipe = new PastaRecipe("최연석");
    pastaRecipe.info();
    pastaRecipe.makeSource();
    pastaRecipe.cook();

    System.out.println("---");

    StakeRecipe stakeRecipe = new StakeRecipe("이현복");
    stakeRecipe.info();
    stakeRecipe.grillStake();
    stakeRecipe.cook();
  }
}
