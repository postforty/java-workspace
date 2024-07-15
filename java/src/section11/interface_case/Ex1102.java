package section11.interface_case;

public class Ex1102 {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();
        samsungTV.userGuide();
        samsungTV.turnOn();
        samsungTV.fold();
        samsungTV.setVolume(120);
        System.out.println("Samung Tv Volume: " + samsungTV.getVolume());
        samsungTV.unfold();
        samsungTV.turnOff();

        System.out.println();

        LGTV lgTV = new LGTV();
        lgTV.turnOn();
        lgTV.rollUp();
        lgTV.setVolume(-120);
        System.out.println("LG Tv Volume: " + lgTV.getVolume());
        lgTV.turnOff();
        lgTV.rollDown();

        System.out.println();

        SamsungLGTV samsungLGTV = new SamsungLGTV();
        samsungLGTV.turnOn();
        samsungLGTV.rollUp();
        samsungLGTV.fold();
        samsungLGTV.setVolume(-120);
        System.out.println("SamsungLG Tv Volume: " + samsungLGTV.getVolume());
        samsungLGTV.turnOff();
        samsungLGTV.rollDown();
        samsungLGTV.unfold();

        System.out.println();

        InnovationTV innovationTV = new InnovationTV();
        innovationTV.userGuide();
        innovationTV.turnOn();
        innovationTV.rollUp();
        innovationTV.fold();
        innovationTV.setVolume(-120);
        System.out.println("SamsungLG Tv Volume: " + innovationTV.getVolume());
        innovationTV.activateAI();
        innovationTV.deactivateAI();
        innovationTV.turnOff();
        innovationTV.rollDown();
        innovationTV.unfold();
    }
}
