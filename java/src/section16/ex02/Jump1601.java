package section16.ex02;

import java.util.ArrayList;

public class Jump1601 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        // ArrayList<Integer> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches);
        System.out.println(pitches.get(1));
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.contains(142));
        System.out.println(pitches.remove("142"));
        System.out.println(pitches.remove("142"));
        System.out.println(pitches);
        System.out.println(pitches.remove(0));
    }
}