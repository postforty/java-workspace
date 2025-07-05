package section19.serializable;

import java.io.Serializable;

public class Person implements Serializable {
  // private static final long serialVersionUID = 1L;

  private String myName;
  private int myAge;

  public Person(String myName, int myAge) {
    this.myName = myName;
    this.myAge = myAge;
  }

  public String getMyName() {
    return this.myName;
  }

  public void setMyName(String myName) {
    this.myName = myName;
  }

  public int getMyAge() {
    return this.myAge;
  }

  public void setMyAge(int myAge) {
    this.myAge = myAge;
  }
}
