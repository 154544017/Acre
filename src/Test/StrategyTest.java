package Test;

import Creation.FactoryMethod.PlantFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Plant.Plant;
import Model.Strategy.ApplyFertilizer;
import Model.Strategy.Context;
import Model.Strategy.Watering;
import org.junit.Test;


public class StrategyTest {

    @Test
    public void operationTest() {
        PotatoFactory potatoFactory = new PotatoFactory();
        Plant potato0 =  potatoFactory.createPlant();

        Context context = new Context(new Watering());
        context.contextInterface(potato0);

        context = new Context(new ApplyFertilizer());
        context.contextInterface(potato0);
    }

}
