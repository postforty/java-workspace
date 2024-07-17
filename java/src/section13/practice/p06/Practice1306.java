package section13.practice.p06;

import java.util.Arrays;
import java.util.Comparator;

public class Practice1306 {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "watermelon", "kiwi" };

        Comparator<String> lengthComparatorASC = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Comparator<String> lengthComparatorDESC = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Arrays.sort(words, lengthComparatorASC);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, lengthComparatorDESC);
        System.out.println(Arrays.toString(words));
    }
}
