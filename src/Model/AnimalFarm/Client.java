package AnimalFarm;

public class Client {

    public static void main(String[] args) {
        ForageGrass forageGrass = new ForageGrass();
        System.out.println("Forage grass's original state: " + forageGrass.getState());

        Notification notification = new Notification();
        forageGrass.attach(notification);

        forageGrass.changeState("mature state");
    }

}
