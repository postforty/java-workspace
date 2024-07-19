package section15.ex04;

public class Jump1502 {
    public static void main(String[] args) {
        String result1 = "";
        result1 += "hello";
        result1 += " ";
        result1 += "jump to java";
    
        System.out.println(result1);

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        sb.insert(5, ",");

        sb.replace(15, sb.length(), "JAVA");
        sb.replace(15, 15, "Python ");
        // sb.replace(15, 22, "");

        sb.delete(15,22);

        sb.reverse();

        System.out.println(sb);
    }
}
