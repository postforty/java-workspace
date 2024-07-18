package section15.ex01;

class Sample extends Object {
    @Override
    public String toString() {
        return "Sample 객체입니다.";
    }
}

public class Ex1501 {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.toString());
    }
}
