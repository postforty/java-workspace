package section11.explicit;

public class Bike {
  String riderName;
  int wheel = 2;

  Bike(String riderName) {
    this.riderName = riderName;
  }

  void info() {
    System.out.println(this.riderName + "의 자전거는 " + this.wheel + "발 자전거 입니다.");
  }

  void ride() {
    System.out.println("씽씽");
  }
}
