package section04;

public class JumpEx0402 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어 가라");
        }
    }
}
