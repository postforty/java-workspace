package section12._interface._extends.speaker;

public class Ex1223 {
  public static void main(String[] args) {
    // BluetoothMic bm = new BluetoothMic(); // 인터페이스는 객체 생성 불가
    TJmic tj = new TJmic();

    tj.connect();

    tj.music();
    tj.sing();
  }
}
