package section02;

public class Ex0208 {
    public static void main(String[] args) {
        int intNum1 = 1;
        byte byteNum1 = (byte) intNum1;
        System.out.println(byteNum1);

        /*
        강제 형변환 주의!
        - 데이터 손실 발생
        - 소수점 이하 자릿수 손실
        - 값의 범위 초과(overflow)
        - 예상치 못한 논리적 오류
         */
        int intNum128 = 128;
        byte byteNum128 = (byte) intNum128;
        System.out.println(byteNum128);
    }
}
