package section16.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Ex1607 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> iter = list.iterator();

        int value = iter.next();
        System.out.println(value);

        while(iter.hasNext()) {
            value = iter.next();
            System.out.println("while문 - " + value);
        }
    }
}
