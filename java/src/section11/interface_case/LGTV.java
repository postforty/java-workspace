package section11.interface_case;

public class LGTV implements RemoteControl, Rollable {
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
        System.out.println("LG Tv is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("LG Tv is now OFF.");
    }

    @Override
    public void rollUp() {
        System.out.println("LG TV is rolling up.");
    } 

    @Override
    public void rollDown() {
        System.out.println("LG TV is rolling down.");
    } 
}
