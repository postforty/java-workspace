package section15.ex05;

public class Ex1511 {
    public static void main(String[] args) {
        double pi = 3.14159265358979;

        System.out.println("첫째 자리 반올림: " + Math.round(pi));
        System.out.println("둘째 자리 반올림: " + Math.round(pi * 10) / 10.0);
        System.out.println("셋째 자리 반올림: " + Math.round(pi * 100) / 100.0);

        System.out.println("첫째 자리 올림: " + Math.ceil(pi));
        System.out.println("둘째 자리 올림: " + Math.ceil(pi * 10) / 10.0);
        System.out.println("셋째 자리 올림: " + Math.ceil(pi * 100) / 100.0);

        System.out.println("첫째 자리 내림: " + Math.floor(pi));
        System.out.println("둘째 자리 내림: " + Math.floor(pi * 10) / 10.0);
        System.out.println("셋째 자리 내림: " + Math.floor(pi * 100) / 100.0);
        
    }
}
