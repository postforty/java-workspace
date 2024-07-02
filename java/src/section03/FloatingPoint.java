package section03;

public record FloatingPoint() {
    public static void main(String[] args) {
        // 부동 소수점 오차
        double doubleNum1 = 0.1;
        doubleNum1 += 0.1;
        doubleNum1 += 0.1;
        System.out.println(doubleNum1);
        
    }

}
