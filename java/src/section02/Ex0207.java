package section02;

public class Ex0207 {
    public static void main(String[] args) {
        // 형변환(casting)
        int intNum1 = 1;
        double doubleNum1;
        doubleNum1 = (double) intNum1;
        doubleNum1 = intNum1; // 자동 형변환(upcasting, 묵시적 형변환)
        System.out.println(doubleNum1);

        System.out.println();

        // 데이터 표현 범위 큰것 -> 작은것 : 강제 형변환
        // 데이터 표현 범위 작은것 -> 큰것 : 자동 형변환
        int newIntNum1 = (int) doubleNum1; // 강제 형변환(downcasting, 명시적 형변환)
        System.out.println(newIntNum1);
    }
}
