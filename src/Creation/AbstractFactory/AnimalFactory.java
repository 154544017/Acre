package Creation.AbstractFactory;

import Model.Animal.*;
import Model.Plant.*;

import java.util.HashMap;

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
