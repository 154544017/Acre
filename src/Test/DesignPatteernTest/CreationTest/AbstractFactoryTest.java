package Test.DesignPatteernTest.CreationTest;

import DesignPattern.Creation.AbstractFactory.AnimalFactory;
import DesignPattern.Creation.AbstractFactory.FemaleFactory;
import DesignPattern.Creation.AbstractFactory.MaleFactory;
import Model.Animal.Animal;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("抽象工厂方法测试"));
        List<Animal> animals = new ArrayList<>();
        AnimalFactory factory = new MaleFactory();
        addAnimal(animals, factory);
        factory = new FemaleFactory();
        addAnimal(animals, factory);
        for(Animal animal: animals){
            animal.show();
        }
        System.out.println(MyUtils.getInfo("抽象工厂方法测试成功"));
    }

    private static void addAnimal(List<Animal> animals, AnimalFactory factory){
        animals.add(factory.createCattle());
        animals.add(factory.createRabbit());
        animals.add(factory.createChicken());
    }
}
