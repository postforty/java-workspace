package section13.practice.p05;

public class Practice1305 {
    @FunctionalInterface
    interface ClickListener {
        void onClick();
    }

    public static void main(String[] args) {
        ClickListener buttonClickListener = () -> System.out.println("Button clicked!");

        simulateButtonClick(buttonClickListener);

    }

    public static void simulateButtonClick(ClickListener listener) {
        listener.onClick();
    }
}
