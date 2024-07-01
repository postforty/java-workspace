package section02;

public class Variable {
    // tip : 자동 들여쓰기 줄 맞춤 alt + shift + f
    // Computer 계산기 : 데이터와 연산자를 이용해 (연산)처리

    // Data == 자료
    // 자료형
    // 1) 기본 자료형(primitive type)
    // - 정수(3) : byte(1byte == 8bit), short(2byte), int(4), long(8)
    // - 실수(3.14) : float(4), double(8)
    // - 문자(a, b, c...) : char(2)
    // - boolean(참/거짓 : true/false)

    // 2) 참조 자료형(reference type)
    // - 문자열(abc) : String
    // - 배열
    // - 객체

    public static void main(String[] args) {
        // 변수(variable) : 변할 수 있는 수
        // 작명 방식
        // - camelCase(lower camel case)
        int a; // 변수 선언
        a = 3; // a에 3을 할당(대입: assignment) : 초기화
        System.out.println(a);

        int b = 5; // 변수 정의
        System.out.println(b); // sout + tab키 자동 완성

        a = 10;
        System.out.println(a);
    }
}
