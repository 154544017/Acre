package Test;

import DesignPattern.Creation.AbstractFactory.AnimalFactory;
import DesignPattern.Creation.AbstractFactory.MaleFactory;
import DesignPattern.Creation.FactoryMethod.PlantFactory;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Animal.Animal;
import DesignPattern.Behavior.Obeserver.Notification;
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
