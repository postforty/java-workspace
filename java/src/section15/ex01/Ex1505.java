package section15.ex01;

class SampleEx05 extends Object {
    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }
}

public class Ex1505 {
    public static void main(String[] args) {
        SampleEx05 s= new SampleEx05();
        SampleEx05 s1= new SampleEx05();
        SampleEx05 s2= s;

        System.out.println(s.equals(s1)); // false
        System.out.println(s.equals(s2)); // true
        System.out.println("s: " + s.hashCode());
        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
    }
}
