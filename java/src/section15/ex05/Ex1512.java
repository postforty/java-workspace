package section15.ex05;

public class Ex1512 {
    public static void main(String[] args) {
        double num = Math.random(); // 0.0이상 ~ 1미만 실수
        System.out.println(num);

        num *= 10;
        System.out.println(num);

        num += 1;
        System.out.println(num);

        int intNum = (int) num;
        System.out.println(intNum);
        
        intNum = (int) (Math.random() * 10 + 1);
        System.out.println(intNum);
        
    }
}
