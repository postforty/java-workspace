package section16.ex02;

import java.util.LinkedList;

public class Ex1605 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Tue");
        linkedList.add("Thu");
        linkedList.add("Fri");

        System.out.println(linkedList);
        
        linkedList.addFirst("Mon");
        
        System.out.println(linkedList);
        
        linkedList.addLast("Sun");

        System.out.println(linkedList);
        
        linkedList.add(2, "Wen");
        linkedList.add(5, "Sat");

        System.out.println(linkedList);

        linkedList.remove("Sun");
        System.out.println(linkedList);
        
        linkedList.removeLast();
        System.out.println(linkedList);
        
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println(linkedList.size());
    }
}
