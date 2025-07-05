package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1406 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int result = 0;

    while (true) {
      System.out.print("숫자 입력: ");

      // 다중 catch 사용 가능
      try {
        int number = scan.nextInt();
        result = 10 / number;
        System.out.println("나누기 결과: " + result);
      } catch (ArithmeticException e) {
        System.out.println("입력하신 내용을 계산할 수 없습니다.");
      } catch (InputMismatchException e) {
        System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
        scan.next(); // 앞서 잘못 입력한 토큰을 버퍼에서 제거(이 코드가 없으면 기존 입력 토큰이 계속 입력되는 문제 발생)
      } 
      // catch 순서상 부모 예외 클래스는 아래쪽에 배치해야 함
      catch (RuntimeException e) {
        System.out.println("알수 없는 비체크 예외가 발생했습니다.");
      } catch (Exception e) {
        System.out.println("알수 없는 예외(체크, 비체크)가 발생했습니다.");
      }
    }
  }
}
