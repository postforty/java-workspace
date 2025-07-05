package section04;

public class Ex0410 {
  public static void main(String[] args) {
    int num = 7;

    // if(조건식){}
    if (num == 1) {
      System.out.println("num은 1입니다.");
    } else if (num == 7) {
      System.out.println("num은 7입니다.");
    } else {
      System.out.println("num은 1도 7도 아닙니다.");
    }

    System.out.println("---");

    // switch(값){}
    switch (num) {
      case 1:
        System.out.println("num은 1입니다.");
        break; // 브레이크를 걸어주지 않으면 아래 코드가 실행됨
      case 7:
        System.out.println("num은 7입니다.");
      default:
        System.out.println("num은 1도 7도 아닙니다.");
    }
  }
}
