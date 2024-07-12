package section10.access.ex01;

class Sample {
    private String secret;

    private String getSecret() {
        return this.secret;
    }

    protected String getSecret(String secret) {
        this.secret = secret;
        return this.secret;
    }
}

public class Jump1006 {
    public static void main(String[] args) {
        Sample s = new Sample();
        // System.out.println(s.secret);
        System.out.println(s.getSecret("private"));
    }
}
