package Test;
import Creation.FactoryMethod.PlantFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Fertilizer.MediumFertilzer;
import Model.Plant.Plant;
import org.junit.Test;
public class BridgeTest {
    @Test
    public void bridgeTest(){
        PlantFactory factory1 = new PotatoFactory();
        Plant corn1 = factory1.createPlant();
        corn1.fertilizer=new MediumFertilzer();
        corn1.show();
        corn1.fertilizer.fertilize();
    }
}
