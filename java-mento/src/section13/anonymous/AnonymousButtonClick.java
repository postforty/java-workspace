package section13.anonymous;

interface ButtonClickListener {
  void click();
}

public class AnonymousButtonClick {
  
  // 인스턴스 내부 클래스 정의
  class Button {
    private ButtonClickListener listener;

    void setButtonListener(ButtonClickListener listener) {
      this.listener = listener;
    }

    void click() {
      if(listener != null) {
        this.listener.click();
      }
    }
  }

  public static void main(String[] args) {
    AnonymousButtonClick buttonExample = new AnonymousButtonClick();
    AnonymousButtonClick.Button button = buttonExample.new Button();

    // ButtonClickListener name = new ButtonClickListener(); // 불가

    // 익명 클래스 사용하여 객체 생성
    button.setButtonListener(new ButtonClickListener() {
      @Override
      public void click() {
        System.out.println("슈팅 버튼을 눌렀습니다.");
      }
    });

    button.click();
  }
}
