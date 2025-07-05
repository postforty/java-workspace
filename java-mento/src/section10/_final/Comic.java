package section10._final;

final public class Comic extends Book {
  boolean isColor;

  Comic(String title, String author, boolean isColor) {
    super(title, author);
    this.isColor = isColor;
  }

  // 부모 클래스의 infoTitle() 메서드가 final이기 때문에 오버라이딩 불가!!!
  // @Override
  // void infoTitle() {
  //   System.out.println("만화책의 제목은 " + this.title + "입니다.");
    
  //   if (isColor) {
  //     System.out.println(this.title + " 만화책은 컬러입니다.");
  //   } else {
  //     System.out.println(this.title + " 만화책은 흑백입니다.");
  //   }
  // }
}
