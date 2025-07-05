package section15;

public class Ex1508 {
  public static void main(String[] args) {
    
    String word = "1I2LOVE3YOU";

    System.out.println(word);

    // int i = word.charAt(1);

    // System.out.println(i);

    // char ch = word.charAt(1);

    // System.out.println(ch);

    System.out.println(word.length()); // 문자열의 길이 반환

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i); // 문자열에서 특정 인덱스의 문자 반환
      int codePoint = ch;

      if (codePoint >= 65 && codePoint <= 90) {
        System.out.print(ch);
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
