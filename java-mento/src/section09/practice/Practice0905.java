package section09.practice;

public class Practice0905 {
  public static void main(String[] args) {
    Book b1 = new Book("어린왕자", 300);
    Book b2 = new Book();
  }
}

class Book {
  String title;
  int pages;

  // 기본 생성자
  Book() {}

  // 생성자를 직접 정의하면 기본 생성자는 사라짐
  // 이 경우 기본 생성자 형태의 생성자를 사용하기 위해서는 위와 같이 직접 정의해야 함

  Book(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }
}