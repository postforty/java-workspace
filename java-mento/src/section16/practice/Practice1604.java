package section16.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice1604 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < 10; i++) {
      int value = (int)(Math.random() * 100) + 1;
      list.add(value);
    }
    
    int sum = 0;
    for(int i = 0; i < list.size(); i++) {
      // list 객체에서 숫자를 가져와서 짝수의 합 구하는 코드(sum에 누적)
      int value = list.get(i);
      if(value % 2 == 0) {
        sum += value;
      }
    }
    System.out.println("짝수의 합 : " + sum);
  }
}
