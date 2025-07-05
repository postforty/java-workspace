package section12.multiple.speaker;

public class Ex1218 {
  public static void main(String[] args) {
    BluetoothMic bm = new BluetoothMic();

    bm.music();
    bm.sing();

    Speaker s = bm; // BluetoothMic 클래스가 구현한 Speaker 인터페이스 타입으로 자동 형변환 가능
    s.music();
    // s.sing(); // 불가

    Microphone m = bm;
    // m.music(); // 불가
    m.sing();
  }
}
