package section09.overloading;

public class ConstructorOverloading {
  String s;
  int a;
  int b;

  ConstructorOverloading() {
    this.s = "java";
    this.a = 1;
    this.b = 2;
  }

  ConstructorOverloading(String s, int a, int b) {
    this.s = s;
    this.a = a;
    this.b = b;
  }

  // 주의! 오버로딩 할 때 매개변수명이 아니라 "매개변수의 타입의 순서"가 앞선 경우와 중복되면 안됨
  // ConstructorOverloading(String s, int b, int a) {
  //   this.s = s;
  //   this.a = a;
  //   this.b = b;
  // }

  ConstructorOverloading(int b, String s, int a) {
    this.s = s;
    this.a = a;
    this.b = b;
  }

  ConstructorOverloading(int b, int a, String s) {
    this.s = s;
    this.a = a;
    this.b = b;
  }
}
