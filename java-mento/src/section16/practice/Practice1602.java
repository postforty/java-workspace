package section16.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice1602 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
