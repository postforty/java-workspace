package section16.ex03;

import java.util.Arrays;
import java.util.HashSet;

public class Jump1605 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Jump");
        System.out.println(set);
        
        set.addAll(Arrays.asList("To", "Java"));
        set.addAll(Arrays.asList("To", "Java"));
        set.addAll(Arrays.asList("To", "Java"));
        set.addAll(Arrays.asList("To", "Java"));
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);
        
        set.remove("To");
        System.out.println(set);
        
        System.out.println(set.size());
    }
}
