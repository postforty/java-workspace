package section02;

public class VariableNamingRules {
    public static void main(String[] args) {
        // * 변수명 작명 규칙
        // int 1a = 1; // 숫자로 시작할 수 없음
        // int int = 1; // 예약어는 사용할 수 없음
        int Int = 1; // 대소문자 구분 함
        // int a! = 1; // 특수문자 사용 불가
        int _a$b = 2; // 다만 _, $는 사용 가능 
        System.out.println(_a$b);
    }
}
