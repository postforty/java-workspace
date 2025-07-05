package section04.practice;

public class Practice0406 {
  public static void main(String[] args) {
    int a = 25;
    
    System.out.println(a/10);

    switch(a/10) {
      case 2:
        System.out.println("a는 20 이상의 숫자입니다.");
        break;
      default:
        System.out.println("a는 20 이상의 숫자가 아닙니다.");
    }
  }
}
