package section19.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputSerialExample {
  public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;

    try {
      fileInputStream = new FileInputStream("src\\section19\\serializable\\object_data.data");
      objectInputStream = new ObjectInputStream(fileInputStream); // 역직열화

      while (fileInputStream.available() != 0) {
        Person person = (Person) objectInputStream.readObject();
        System.out.println("이름 : " + person.getMyName() + ", 나이 : " + person.getMyAge());
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (objectInputStream != null) {
          objectInputStream.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
