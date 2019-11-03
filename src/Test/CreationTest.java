package Test;

import DesignPattern.Creation.AbstractFactory.AnimalFactory;
import DesignPattern.Creation.AbstractFactory.FemaleFactory;
import DesignPattern.Creation.AbstractFactory.MaleFactory;
import DesignPattern.Creation.FactoryMethod.*;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Plant.Plant;
import Model.Goods.GoodsEnum;
import org.junit.Test;

public class CreationTest {
    @Test
    public void plantFactoryTest() {
        PlantFactory factory1 = new PotatoFactory();
        Plant corn1 = factory1.createPlant();
        Plant corn2 = factory1.createPlant();
        corn1.grow();
        corn2.grow();
        corn1.show();
        corn2.show();
    }

    @Test
    public void animalFactoryTest() {
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
//        PlantFarmScene scene1 = (PlantFarmScene) new SceneBuilder("PlantFarm").buildBackground().buildDecoration().buildOthers().build();
//        PlantFarmScene scene2 = (PlantFarmScene) new SceneBuilder("Observer").buildBackground().buildDecoration().build();
//        Rancher rancher = new Rancher("omf");
//        scene2.setRancher(rancher);
//        scene2.plant(new PotatoFactory().createPlant());
//        scene2.harvestPlant();


    }

    //    @Test
//    public void NullLifeTest(){
//        DesignPattern.NullLife phantom =new DesignPattern.NullLife();
//        phantom.show();
//        phantom.setId();
//        System.out.println(phantom.isNull());
//        // 待feed
//    }
    @Test
    public void goodsFactoryTest() {
        GoodsFactory goodsFactory = GoodsFactory.getInstance();
        Goods chicken = goodsFactory.getGoods(GoodsEnum.CHICKEN);
        chicken.show();
        Goods chicken2 = goodsFactory.getGoods(GoodsEnum.CHICKEN);
        chicken.show();
        Goods egg = goodsFactory.getGoods(GoodsEnum.EGG);
        egg.show();

    }
}
