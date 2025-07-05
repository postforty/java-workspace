package section13.permit;

class PermitExampleNew {

  public interface InClassInterface {
    void print();
  }

  private class InClass implements InClassInterface {
    @Override
    public void print() {
      System.out.println("접근을 private로 제한합니다.");
    }
  }

  public InClassInterface getInClass() {
    return new InClass();
  }
}

public class PermitMain {
  public static void main(String[] args) {
    PermitExampleNew permitExample = new PermitExampleNew();

    // PermitExample.InClass inClass = permitExample.new InClass(); // 인스턴스 내부 클래스 InClass에 직접 접근 불가능(private 기능 유효)

    PermitExampleNew.InClassInterface inClass = permitExample.getInClass();
    inClass.print();
  }
}
