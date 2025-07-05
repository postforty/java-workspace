package section06;

public class Ex0602 {
  public static void main(String[] args) {

    // 배열 정의시 크기를 반드시 지정해야 함
    // 한번 지정된 크기는 변경 불가
    // 벼열 정의시 배열의 타입 작성해야 함(모든 요소는 동일 타입을 가짐)
    int[] arr = new int[4];
    System.out.println(arr[0]); // 초기값 0

    float[] arrF = new float[4];
    System.out.println(arrF[0]); // 초기값 0.0

    char[] arrC = new char[4];
    System.out.println(arrC[0]); // 초기값 ''

    String[] arrS = new String[4];
    System.out.println(arrS[0]); // 초기값 null(모든 참조타입에 적용)

    // 배열에 값 저장
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    // arr[4] = 50; // java.lang.ArrayIndexOutOfBoundsException

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
  }
}
