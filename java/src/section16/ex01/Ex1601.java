package section16.ex01;

class ClassInt {
    private int element;

    public int getElement() {
        return this.element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}

class ClassString {
    private String element;

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }
}

class ClassDouble {
    private double element;

    public double getElement() {
        return this.element;
    }

    public void setElement(double element) {
        this.element = element;
    }
}

class ClassGeneric<E> {
    private E element;

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}

public class Ex1601 {
    public static void main(String[] args) {
        ClassInt classInt = new ClassInt();
        classInt.setElement(10);
        System.out.println(classInt.getElement());

        ClassString classString = new ClassString();
        classString.setElement("10");
        System.out.println(classString.getElement());

        ClassDouble classDouble = new ClassDouble();
        classDouble.setElement(3.14);
        System.out.println(classDouble.getElement());

        System.out.println("-------------------------");

        ClassGeneric<Integer> classGenericInt = new ClassGeneric<Integer>();
        classGenericInt.setElement(10);
        System.out.println(classGenericInt.getElement());

        ClassGeneric<String> classGenericString = new ClassGeneric<>();
        classGenericString.setElement("10");
        System.out.println(classGenericString.getElement());

        ClassGeneric<Double> classGenericDouble = new ClassGeneric<>();
        classGenericDouble.setElement(3.14);
        System.out.println(classGenericDouble.getElement());
    }
}
