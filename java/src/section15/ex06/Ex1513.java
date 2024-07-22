package section15.ex06;

public class Ex1513 {
    public static void main(String[] args) {
        // Integer intObject = new Integer(100);

        Integer intObject1 = Integer.valueOf(100);
        System.out.println(intObject1);

        Integer intObject2 = 200; // Autoboxing
        System.out.println(intObject2);

        Double doubleObject = 123.456;
        System.out.println(doubleObject);

        Character charObject = 'A';
        System.out.println(charObject);

        // AutoUnboxing
        int intValue = intObject1;
        System.out.println(intValue);

        double doubleValue = doubleObject;
        System.out.println(doubleValue);

        char charValue = charObject;
        System.out.println(charValue);

        String strNumber = "200";
        // System.out.println(strNumber+strNumber);
        int intNumber = Integer.parseInt(strNumber);
        System.out.println(intNumber + intNumber);

        double doubleNumber = Double.parseDouble("123.456");
        System.out.println(doubleNumber + doubleNumber);

        String intString = Integer.toString(intNumber);
        System.out.println(intString + intString);

        String doubleString = Double.toString(doubleNumber);
        System.out.println(doubleString + doubleString);

        String doubleObjectString = Double.toString(doubleObject);
        System.out.println(doubleObjectString + doubleObjectString);

        int maxInt = Integer.max(10, 20);
        System.out.println(maxInt);

        int minInt = Integer.min(10, 20);
        System.out.println(minInt);

    }
}
