package section16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex1609 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    // ArrayList와 LinkedList의 성능 비교
    // 결론
    // - 일반적인 경우에는 ArrayList 사용
    // - 삽입, 삭제가 많은 경우 LinkedList 사용이 유리함
    // - 사용방법 동일함

    // --- 요소 추가(add() 메서드 호출) ---
    long startTime = System.nanoTime();

    for (int i = 0; i < 1000000; i++) {
      list.add(i);
    }

    long endTime = System.nanoTime();
    long duration = endTime - startTime; // 성능 측정
    System.out.println("ArrayList add\t:\t" + duration); // 더 빠름

    startTime = System.nanoTime();

    for (int i = 0; i < 1000000; i++) {
      linkedList.add(i);
    }

    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList add\t:\t" + duration); // 더 느림

    // --- 요소 삽입(add() 메서드 호출) ---
    startTime = System.nanoTime();

    list.add(1, 200);

    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList add 삽입\t:\t" + duration); // 더 느림

    startTime = System.nanoTime();

    linkedList.add(1, 200);

    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList add 삽입\t:\t" + duration); // 더 빠름

    // --- 요소 삭제(remove() 메서드 호출) ---
    startTime = System.nanoTime();

    list.remove(1);

    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList 삭제\t:\t" + duration); // 더 느림

    startTime = System.nanoTime();

    linkedList.remove(1);

    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList 삭제\t:\t" + duration); // 더 빠름
  }
}
