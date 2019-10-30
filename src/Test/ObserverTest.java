package Test;

import Creation.AbstractFactory.AnimalFactory;
import Creation.AbstractFactory.MaleFactory;
import Creation.FactoryMethod.CornFactory;
import Creation.FactoryMethod.PlantFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Animal.Animal;
import Model.Obeserver.Notification;
import Model.Obeserver.Observer;
import Model.Plant.Corn;
import Model.Plant.Plant;
import Model.Plant.Potato;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void notifyTest() {
        PlantFactory factory1 = new PotatoFactory();
        Potato corn1 = (Potato) factory1.createPlant();
        Notification notification = new Notification();
        corn1.attach(notification);
        corn1.grow();

        AnimalFactory factory = new MaleFactory();
        Animal animal = factory.createRabbit();
        animal.attach(notification);
        animal.grow();

    }
}
