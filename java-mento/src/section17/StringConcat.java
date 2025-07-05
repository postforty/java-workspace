package section17;

@FunctionalInterface
interface StrConcat {
  String concat(String str1, String str2);
}

public class StringConcat {
  public static void main(String[] args) {
    String str = " ";

    StrConcat strConcat = (String str1, String str2) -> {
      // str = " "; // effective final이기 때문에 외부 변수 값 변경 불가. 
      return str1 + str + str2; // 외부 변수를 사용할 수는 있음
    };

    System.out.println(strConcat.concat("Hello", "Java"));
  }
}
