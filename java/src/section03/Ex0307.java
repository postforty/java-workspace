package section03;

public class Ex0307 {
    public static void main(String[] args) {
        // 이항 - 논리 연산자
        // 논리곱(AND)
        System.out.println("true && true\t: " + (true && true));
        System.out.println("true && false\t: " + (true && false));
        System.out.println("false && true\t: " + (false && true));
        System.out.println("false && false\t: " + (false && false));
        // 논리합(OR)
        System.out.println("true || true\t: " + (true || true));
        System.out.println("true || false\t: " + (true || false));
        System.out.println("false || false\t: " + (false || false));
        // 배타적논리합(XOR)
        System.out.println("true ^ true\t: " + (true ^ true));
        System.out.println("false ^ true\t: " + (false ^ true));
        System.out.println("true ^ false\t: " + (true ^ false));
        System.out.println("false ^ false\t: " + (false ^ false));
    }
}
