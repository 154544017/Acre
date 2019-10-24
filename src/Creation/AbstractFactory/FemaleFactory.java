package Creation.AbstractFactory;

import Model.Animal.*;

public class FemaleFactory extends AnimalFactory {
    @Override
    public Animal createCattle() {
        Cow cow = (Cow) animalMap.get("Cow");
        cow.setId();
        return cow;
    }

    @Override
    public Animal createRabbit() {
        FemaleRabbit rabbit = (FemaleRabbit) animalMap.get("FemaleRabbit");
        rabbit.setId();
        return rabbit;
    }

    @Override
    public Animal createChicken() {
        Hen hen = (Hen) animalMap.get("Hen");
        hen.setId();
        return hen;
    }
}
