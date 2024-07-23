package section16.ex05;

import java.util.HashMap;
import java.util.Map;

public class Jump1605 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map);

        System.out.println(map.get("people"));

        map.put("java", null);
        System.out.println(map);

        map.put("java", "자바");
        System.out.println(map);

        System.out.println(map.get("apple"));
        System.out.println(map.getOrDefault("apple", "값이 없음"));

        System.out.println(map.containsKey("java"));
        System.out.println(map.containsKey("apple"));

        System.out.println(map.containsValue("사람"));
        System.out.println(map.containsValue(null));

        System.out.println(map.remove("people"));
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.keySet());

        System.out.println(map.entrySet());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", " + "value: " + entry.getValue());
        }
    }
}
