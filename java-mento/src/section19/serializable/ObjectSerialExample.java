package section19.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialExample {
  public static void main(String[] args) {
    Person person1 = new Person("김일남", 99);
    Person person2 = new Person("김이남", 98);

    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;

    try {
      fileOutputStream = new FileOutputStream("src\\section19\\serializable\\object_data.data");
      objectOutputStream = new ObjectOutputStream(fileOutputStream);

      // Person 객체를 직열화
      objectOutputStream.writeObject(person1);
      objectOutputStream.writeObject(person2);
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (objectOutputStream != null) {
          objectOutputStream.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
