package section08.parameter;

public class CalcReturn {
  int sum(int num1, int num2) {
    int result = num1 + num2;
    
    System.out.println("sum() 메서드 호출!");
    
    // return 사용시 주의 사항
    // 1. 메서드 왼쪽에 반환 타입을 적어 주어야 함.
    // 2. return 키워드 아래에 코드 작성 불가(메서드가 종료되기 때문)
    return result;

    // System.out.println("sum() 메서드 종료!"); // 사용 불가
  }
}
