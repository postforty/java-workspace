package section10;

public class Ex10_03 {
  public static void main(String[] args) {
    Book book = new Book();
    book.title = "멘토 자바";
    book.price = 32000;
    book.info();

    Comic comic = new Comic();
    comic.title = "포켓몬";
    comic.price = 10000;
    comic.info();
  }
}
