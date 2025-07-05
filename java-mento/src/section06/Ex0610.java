package section06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex0610 {
  public static void main(String[] args) {
    // int[] arr = {3, 5, 2, 4, 1}; // 불가 (Comparator를 이용하기 위해서는 wrapper 클래스 타입을 사용해야 함)
    Integer[] arr = {3, 5, 2, 4, 1}; 
    
    // Arrays 클래스의 sort() 메서드 사용한 내림차순 정렬
    Arrays.sort(arr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
  }
}
