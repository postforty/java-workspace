package section16.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1605 {
  public static void main(String[] args) {
    String[] balls = {
        "빨간색",
        "빨간색",
        "빨간색",
        "빨간색",
        "파란색",
        "파란색",
        "파란색",
        "검은색",
        "검은색",
        "검은색",
    };
    Map<String, Integer> map = new HashMap<>();

    for (String ball : balls) {
      if (map.containsKey(ball)) {
        map.put(ball, map.get(ball) + 1); // ball과 같은 key가 존재한다면 기존 값에 +1한 값을 저장
      } else {
        map.put(ball, 1); // ball과 같은 key가 없다면 새로운 Map.Entry 객체 생성
      }
    }

    Set<String> keys = map.keySet();

    // System.out.println(keys);

    // Set은 순서가 보장되지 않음
    for(String key:keys) {
      System.out.println(key + ": " + map.get(key) + "개");
    }

    System.out.println("---");

    System.out.println("빨간색: " + map.get("빨간색") + "개");
    System.out.println("파란색: " + map.get("파란색") + "개");
    System.out.println("검은색: " + map.get("검은색") + "개");

  }
}
