package section15;

public class Ex1514 {
  public static void main(String[] args) {
    double num = 3.14159265358979;

    System.out.println("첫째 자리 반올림 : " + Math.round(num));
    System.out.println("둘째 자리 반올림 : " + Math.round(num * 10) / 10.0);
    // 반올림해서 소수점 3자리 표현 해보세요!
    System.out.println("넷째 자리 반올림 : " + Math.round(num * 1000) / 1000.0);

    System.out.println("---");

    System.out.println("첫째 자리 올림 : " + Math.ceil(num));
    System.out.println("둘째 자리 올림 : " + Math.ceil(num * 10) / 10.0);

    System.out.println("---");
    
    System.out.println("첫째 자리 내림 : " + Math.floor(num));
    System.out.println("둘째 자리 내림 : " + Math.floor(num * 10) / 10.0);
    
    System.out.println("---");

    System.out.println("절대값 : " + Math.abs(-100));

    System.out.println("---");

    System.out.println("최댓값 : " + Math.max(1, 2));
    System.out.println("최솟값 : " + Math.min(1, 2));
    
  }
}
