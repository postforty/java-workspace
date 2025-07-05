package section16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex1617 {
  public static void main(String[] args) {

    // HashMap<String, String> map = new HashMap<>();
    Map<String, String> map = new HashMap<>();

    System.out.println(map); // {}

    // 영어 사전 만들기
    map.put("spring", "봄"); // Map.Entry 객체 추가

    System.out.println(map); // {spring=봄}

    map.put("summer", "여름");
    map.put("autumn", "가을");
    map.put("winter", "겨울");
    System.out.println(map);
    // {spring=봄, winter=겨울, autumn=가을, summer=여름}
    // 순서 보장되지 않음(순서 없음)

    map.remove("winter"); // Map.Entry 객체 삭제
    System.out.println(map);
    // {spring=봄, autumn=가을, summer=여름}

    // 해당 키가 존재하는지 확인
    System.out.println(map.containsKey("winter")); // false
    System.out.println(map.containsKey("spring")); // true

    System.out.println(map.containsValue("겨울")); // false
    System.out.println(map.containsValue("봄")); // true

    Set<String> mapKeys = map.keySet(); // key를 Set 컬렉션 객체로 반환
    System.out.println(mapKeys); // [spring, autumn, summer]

    // Map.Entry 객체를 Set 컬렉션 객체로 반환
    System.out.println(map.entrySet()); // [spring=봄, autumn=가을, summer=여름]

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println("키는 " + entry.getKey() + ", 값은 " + entry.getValue() + "입니다.");
    }

    /*
     * 출력 결과
     * 
     * 키는 spring, 값은 봄입니다.
     * 키는 autumn, 값은 가을입니다.
     * 키는 summer, 값은 여름입니다.
     */

  }
}
