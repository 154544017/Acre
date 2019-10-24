package Creation.AbstractFactory;

import Model.Animal.Animal;
import Model.Animal.MaleRabbit;
import Model.Animal.Ox;
import Model.Animal.Rooster;

public class MaleFactory extends AnimalFactory {
    @Override
    public Animal createCattle() {
        Ox ox = (Ox) animalMap.get("Ox");
        ox.setId();
        return ox;
    }

    @Override
    public Animal createRabbit() {
        MaleRabbit rabbit = (MaleRabbit) animalMap.get("MaleRabbit");
        rabbit.setId();
        return rabbit;
    }

    @Override
    public Animal createChicken() {
        Rooster rooster = (Rooster) animalMap.get("Rooster");
        rooster.setId();
        return rooster;
    }
}
