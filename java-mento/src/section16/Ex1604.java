package section16;

import java.util.ArrayList;
import java.util.List;

public class Ex1604 {
  public static void main(String[] args) {
    // ArrayList<String> arrayList = new ArrayList<>();
    List<String> arrayList = new ArrayList<>();

    System.out.println(arrayList); // []
    
    arrayList.add("딸기"); // 추가
    arrayList.add("바나나");
    arrayList.add("망고"); 
    System.out.println(arrayList); // [딸기, 바나나, 망고]
    
    arrayList.add(1, "수박"); // 1번 인덱스에 삽입
    System.out.println(arrayList); // [딸기, 수박, 바나나, 망고]
    
    arrayList.set(2, "복숭아"); // 치환(수정)
    System.out.println(arrayList); // [딸기, 수박, 복숭아, 망고]
    
    arrayList.remove(1); // 1번 인덱스 요소 삭제
    System.out.println(arrayList); // [딸기, 복숭아, 망고]
    
    arrayList.remove("복숭아"); // 객체와 동일한 요소 삭제
    System.out.println(arrayList); // [딸기, 망고]
    
    System.out.println(arrayList.get(1)); // 반환(조회)
    
    System.out.println(arrayList.contains("복숭아")); // false
    System.out.println(arrayList.contains("딸기")); // true

    arrayList.clear(); // 전체 요소 삭제
    System.out.println(arrayList);

  }
}
