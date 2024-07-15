package section11.interface_case;

public class InnovationTV implements RemoteControl, AdvancedTV {
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
        System.out.println("SamsungLG Tv is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungLG Tv is now OFF.");
    }

    @Override
    public void fold() {
        System.out.println("SamsungLG TV is now folded.");
    }

    @Override
    public void unfold() {
        System.out.println("SamsungLG TV is now unfolded.");
    }

    @Override
    public void rollUp() {
        System.out.println("SamsungLG TV is rolling up.");
    } 

    @Override
    public void rollDown() {
        System.out.println("SamsungLG TV is rolling down.");
    } 

    @Override
    public void activateAI() {
        System.out.println("SamsungLG TV AI is now activated.");
    }

    @Override
    public void deactivateAI() {
        System.out.println("SamsungLG TV AI is now deactivated.");
    }
}
