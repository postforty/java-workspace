package section10._final;

public class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  // final 메서드는 자식 클래스에서 오버라이딩 불가!!!
  final void infoTitle() {
    System.out.println("책의 제목은 " + this.title + "입니다.");
  }
}
