package section15.practice.p03;

import java.util.Arrays;

public class Practice1503 {
    public static void main(String[] args) {
        // 1. 문자열 길이를 구하고 출력하세요
        String str = "Hello, World!";
        System.out.println("1: " + str.length());

        // 2. 두 문자열을 비교하여 값이 같으면 "같다", 다르면 "다르다"를 출력하세요
        String str1 = "Hello";
        String str2 = new String("hello");

        if (str1.equals(str2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        // 3. 두 문자열을 연결하여 전체 이름을 출력하세요
        String firstName = "일남";
        String lastName = "김";
        String fullName = lastName + firstName;
        System.out.println(fullName);

        // 4. 문자열 str에서 "World" 부분 문자열을 추출하여 출력하세요
        String str3 = "Hello, World!";
        str3 = str3.substring(7, 12);
        System.out.println("4: " + str3);

        // 5. 모든 'o'를 '0'으로 대체하여 출력하세요
        String str4 = "Hello, World!";
        String replaceStr4 = str4.replaceAll("o", "0");
        System.out.println("5: " + replaceStr4);

        // 6. 문자열을 콤마를 기준으로 분리하여 각각의 단어를 출력하세요
        String str5 = "Apple, Banana, Cherry";
        String[] fruits = str5.split(", ");
        System.out.println("6: " + Arrays.toString(fruits));

        // 7. 양쪽의 공백을 제거한 후 출력하세요
        String str6 = "   Hello, World!   ";
        String trimmedStr6 = str6.trim();
        System.out.println("7: " + trimmedStr6);

    }
}
