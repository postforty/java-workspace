package section11.explicit;

public class FourWheelBike extends Bike {

  FourWheelBike(String riderName) {
    super(riderName);
  }

  @Override
  void info() {
    super.info();
    
    if(this.wheel == 2) {
      System.out.println("안전을 위해 4발 자전거로 만드세요.");
    } else {
      System.out.println("이미 4발 자전거입니다.");
    }
  }

  void addWheel() {
    if (this.wheel == 2) {
      this.wheel = 4;
      System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
    } else {
      System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
    }
  }
  
}
