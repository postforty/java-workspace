package section11.interface_case;

public class SamsungTV implements RemoteControl, Foldable {

    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Samung Tv is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samung Tv is now OFF.");
    }

    @Override
    public void fold() {
        System.out.println("Samsung TV is now folded.");
    }

    @Override
    public void unfold() {
        System.out.println("Samsung TV is now unfolded.");
    }
}
