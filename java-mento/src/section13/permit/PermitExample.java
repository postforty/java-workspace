package section13.permit;

public class PermitExample {
  private class InClass {
    public void print() {
      System.out.println("접근을 private로 제한합니다.");
    }
  }

  public InClass getInClass() {
    return new InClass();
  }

  public static void main(String[] args) {
    PermitExample permitExample = new PermitExample();

    // InClass가 private이지만 동일 클래스 내에 있기 때문에 아래 두 경우 모두 가능!

    // 사례1
    PermitExample.InClass inClass = permitExample.new InClass();
    inClass.print();

    // 사례2
    permitExample.getInClass().print();
  }
}
