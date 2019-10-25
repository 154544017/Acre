package Test;

import Model.PlantFarm.ForageGrass;
import Model.PlantFarm.Notification;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void notifyTest() {
        ForageGrass forageGrass = new ForageGrass();
        System.out.println("Forage grass's original state: " + forageGrass.getState());

        Notification notification = new Notification();
        forageGrass.attach(notification);

        forageGrass.changeState("mature state");
    }
}
