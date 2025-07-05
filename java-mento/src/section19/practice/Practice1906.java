package section19.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1906 {
  public static void main(String[] args) {
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    try {
      fileReader = new FileReader("src\\section19\\practice\\fruit.txt", StandardCharsets.UTF_8); // 인코딩 추가
      bufferedReader = new BufferedReader(fileReader);
      Map<String, Integer> map = new HashMap<>();

      String read = "";

      while ((read = bufferedReader.readLine()) != null) {
        // System.out.println(read);
        if(map.containsKey(read)) {
          map.put(read, map.get(read) + 1);
        } else {
          map.put(read, 1);
        }
      }

      // System.out.println(map);

      Set<String> keys = map.keySet();
      for(String key: keys) {
        System.out.println(key + " : " + map.get(key) + "번");
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (bufferedReader != null) {
          bufferedReader.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
