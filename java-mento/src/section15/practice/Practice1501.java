package section15.practice;

class User {
  private String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "이름: " + this.name + ", 나이: " + this.age;
  }
}

public class Practice1501 {
  public static void main(String[] args) {
    User user = new User("김철수", 22);
    System.out.println(user);
  }
}
