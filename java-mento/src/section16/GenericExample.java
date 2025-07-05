package section16;

class ClassInt {
  private int element;

  void set(int element) {
    this.element = element;
  }

  int get() {
    return element;
  }
}

class ClassString {
  private String element;

  void set(String element) {
    this.element = element;
  }

  String get() {
    return element;
  }
}

class ClassDouble {
  private double element;

  void set(double element) {
    this.element = element;
  }

  double get() {
    return element;
  }
}

// 제네릭 타입 정의
// - 데이터의 타입을 일반화하는 용도
// - 클래스, 인터페이스, 메서드 정의시 사용 가능
// - 타입 변수는 대문자 사용(T, E, K, N, V)
class ClassGeneric<T> {
  private T element;

  void set(T element) {
    this.element = element;
  }

  T get() {
    return element;
  }
}

public class GenericExample {
  public static void main(String[] args) {
    ClassInt classInt = new ClassInt();
    classInt.set(10);
    System.out.println("classInt: " + classInt.get());
    
    System.out.println("---");
    
    ClassString classString = new ClassString();
    classString.set("java");
    System.out.println("classString: " + classString.get());
    
    System.out.println("---");
    
    ClassDouble classDouble = new ClassDouble();
    classDouble.set(3.14);
    System.out.println("classDouble: " + classDouble.get());

    System.out.println("---");

    // 제네닉 사용시 반드시 Wapper 클래스 타입 사용해야 함(기본 타입 불가)
    ClassGeneric<Integer> classIntGeneric = new ClassGeneric<Integer>();
    classIntGeneric.set(10);
    System.out.println("classIntGeneric: " + classIntGeneric.get());

    System.out.println("---");

    // 제네릭 타입 사용시 뒷쪽은 생략 가능
    ClassGeneric<String> classStringGeneric = new ClassGeneric<>();
    classStringGeneric.set("java");
    System.out.println("classStringGeneric: " + classStringGeneric.get());

    System.out.println("---");
    
    ClassGeneric<Double> classDoubleGeneric = new ClassGeneric<Double>();
    classDoubleGeneric.set(3.14);
    System.out.println("classDoubleGeneric: " + classDoubleGeneric.get());
  }
}
