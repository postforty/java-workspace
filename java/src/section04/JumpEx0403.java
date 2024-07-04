package section04;

public class JumpEx0403 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        // 중첩 if문
        if (money >= 3000) {
            System.out.println("돈을 내고 택시를 타고 가라");
        } else {
            if (hasCard) {
                System.out.println("카드로 택시를 타고 가라");
            } else {
                System.out.println("걸어가라");
            }
        }
    }
}
