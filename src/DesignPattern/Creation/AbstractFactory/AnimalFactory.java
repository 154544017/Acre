package DesignPattern.Creation.AbstractFactory;

import Model.Animal.*;

import java.util.HashMap;

/**
 * 使用了抽象工厂模式和原型模式
 * AnimalFactory为工厂基类，拥有所有动物的原型
 */
public abstract class AnimalFactory {
    
    protected static HashMap<String, Animal> animalMap = new HashMap<String, Animal>(){

        {
            put("MaleRabbit",new MaleRabbit());
            put("FemaleRabbit", new FemaleRabbit());
            put("Rooster", new Rooster());
            put("Hen", new Hen());
            put("Cow", new Cow());
            put("Ox", new Ox());
        }
    };
    public abstract Animal createCattle();
    public abstract Animal createRabbit();
    public abstract Animal createChicken();
}
