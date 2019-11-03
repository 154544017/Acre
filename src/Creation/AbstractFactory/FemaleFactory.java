package Creation.AbstractFactory;

import Model.Animal.*;

/**
 * 雌性动物工厂，用原型的克隆方法创建雌性动物
 */
public class FemaleFactory extends AnimalFactory {
    @Override
    public Animal createCattle() {
        Cow cow = (Cow) animalMap.get("Cow").clone();
        cow.setId();
        return cow;
    }

    @Override
    public Animal createRabbit() {
        FemaleRabbit rabbit = (FemaleRabbit) animalMap.get("FemaleRabbit").clone();
        rabbit.setId();
        return rabbit;
    }

    @Override
    public Animal createChicken() {
        Hen hen = (Hen) animalMap.get("Hen").clone();
        hen.setId();
        return hen;
    }
}
