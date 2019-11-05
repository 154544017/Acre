package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Creation.AbstractFactory.AnimalFactory;
import DesignPattern.Creation.AbstractFactory.MaleFactory;
import DesignPattern.Creation.FactoryMethod.PlantFactory;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Animal.Animal;
import DesignPattern.Behavior.Obeserver.Notification;
import Model.Plant.Potato;
import Util.MyUtils;

public class ObserverTest {

    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("观察者模式测试"));
        PlantFactory factory1 = new PotatoFactory();
        Potato corn1 = (Potato) factory1.createPlant();
        Notification notification = new Notification();
        corn1.attach(notification);
        corn1.grow();

        AnimalFactory factory = new MaleFactory();
        Animal animal = factory.createRabbit();
        animal.attach(notification);
        animal.grow();
        System.out.println(MyUtils.getInfo("观察者模式测试成功"));
    }

}
