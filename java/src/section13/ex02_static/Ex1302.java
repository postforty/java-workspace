package section13.ex02_static;

class OuterStatic {
    private String outerInstanceField = "outer instance field";
    private static String outerStaticField = "outer static field";
    
    static class InnerStatic {
        String innerInstanceField = "inner instance field";
        static String innerStaticField = "inner static field";
        
        void displayInstance() {
            // System.out.println(outerInstanceField); // 인스턴스 멤버 접근 불가
            System.out.println(outerStaticField); 
        }
    }
}

public class Ex1302 {
    public static void main(String[] args) {
        OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
        inner.displayInstance();
        System.out.println(inner.innerInstanceField);
        System.out.println(inner.innerStaticField);
        System.out.println(OuterStatic.InnerStatic.innerStaticField);

    }
}
