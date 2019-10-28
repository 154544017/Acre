package Test;
import Creation.AbstractFactory.AnimalFactory;
import Creation.AbstractFactory.FemaleFactory;
import Creation.FactoryMethod.PlantFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Animal.Animal;
import Model.Fodder.MediumFodder;
import Model.Plant.Plant;
import org.junit.Test;
public class BridgeTest {
    @Test
    public void bridgeTest(){
        AnimalFactory factory1 = new FemaleFactory();
        Animal chicken = factory1.createChicken();
        chicken.fodder=new MediumFodder();
        chicken.show();
        chicken.fodder.feed();





    }
}
