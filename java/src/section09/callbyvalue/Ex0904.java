package section09.callbyvalue;

public class Ex0904 {
    static void modifyValue(int value) {
        value = 20;
        System.out.println("modifyValue() 메서드 내 변경된 value\t: " + value);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println("modifyValue() 메서드 호출 전 value\t: " + value);
        
        // 값에 의한 호출(Call by Value)
        modifyValue(value);
        System.out.println("modifyValue() 메서드 호출 후 value\t: " + value);
    }
}
