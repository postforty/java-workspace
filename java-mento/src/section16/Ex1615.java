package section16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex1615 {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println(list); // [1, 2, 3, 4, 5]

    Iterator<Integer> iter = list.iterator();

    while(iter.hasNext()) {
      System.out.print(iter.next() + " "); // 1 2 3 4 5
    }
  }
}
