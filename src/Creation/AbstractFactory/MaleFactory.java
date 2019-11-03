package Creation.AbstractFactory;

import Model.Animal.Animal;
import Model.Animal.MaleRabbit;
import Model.Animal.Ox;
import Model.Animal.Rooster;

/**
 * 雄性动物工厂，用原型的克隆方法创建雄性动物
 */
public class MaleFactory extends AnimalFactory {
    @Override
    public Animal createCattle() {
        Ox ox = (Ox) animalMap.get("Ox").clone();
        ox.setId();
        return ox;
    }

    @Override
    public Animal createRabbit() {
        MaleRabbit rabbit = (MaleRabbit) animalMap.get("MaleRabbit").clone();
        rabbit.setId();
        return rabbit;
    }

    @Override
    public Animal createChicken() {
        Rooster rooster = (Rooster) animalMap.get("Rooster").clone();
        rooster.setId();
        return rooster;
    }
}
