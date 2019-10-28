package Test;

import Creation.AbstractFactory.AnimalFactory;
import Creation.AbstractFactory.FemaleFactory;
import Creation.AbstractFactory.MaleFactory;
import Creation.Builder.SceneBuilder;
import Creation.FactoryMethod.*;

import Model.Plant.Plant;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import org.junit.Test;

public class CreationTest {
    @Test
    protected void plantFactoryTest(){
        PlantFactory factory1 = new PotatoFactory();
        Plant corn1 = factory1.createPlant();
        Plant corn2 = factory1.createPlant();
        corn1.grow();
        corn2.grow();
        corn1.show();
        corn2.show();
    }

    @Test
    public void animalFactoryTest(){
        AnimalFactory factory1 = new MaleFactory();
        AnimalFactory factory2 = new FemaleFactory();
        for (int i = 0; i < 2; i++) {
            factory1.createCattle().eat();
            factory1.createChicken().eat();
            factory1.createRabbit().eat();
            factory2.createCattle().eat();
            factory2.createChicken().eat();
            factory2.createRabbit().eat();
        }
    }

    @Test
    public void builderTest(){
        AnimalFarmScene scene1 = (AnimalFarmScene) new SceneBuilder("AnimalFarm").buildBackground().buildDecoration().build();
        PlantFarmScene scene2 = (PlantFarmScene) new SceneBuilder("PlantFarm").buildBackground().buildDecoration().build();
    }

//    @Test
//    public void NullLifeTest(){
//        NullLife phantom =new NullLife();
//        phantom.show();
//        phantom.setId();
//        System.out.println(phantom.isNull());
//        // 待feed
//    }
}
