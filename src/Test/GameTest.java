package Test;

import Creation.Builder.SceneBuilder;
import Creation.FactoryMethod.ChineseCabbageFactory;
import Creation.FactoryMethod.CornFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Potato;
import Model.Rancher;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Strategy.ApplyFertilizer;
import Model.Strategy.Context;
import Model.Strategy.Watering;
import org.junit.Test;

public class GameTest {

    @Test
    public void gameTest(){
        //加载玩家信息
        Rancher rancher = new Rancher("wn");
        //进入农场
        PlantFarmScene scene = (PlantFarmScene)new SceneBuilder("PlantFarm", rancher).construct();
        //查看农场信息
        scene.showPlantFarm();
        //种玉米、土豆、大白菜
        Corn corn = (Corn) new CornFactory().createPlant();
        scene.plant(corn);
        Potato potato = (Potato) new PotatoFactory().createPlant();
        scene.plant(potato);
        ChineseCabbage chineseCabbage = (ChineseCabbage) new ChineseCabbageFactory().createPlant();
        scene.plant(chineseCabbage);
        scene.showPlantFarm();
        //给玉米浇水，土豆施肥
        Context context = new Context(new Watering());
        context.contextInterface(corn);
        context.setStrategy(new ApplyFertilizer());
        context.contextInterface(potato);
        context.contextInterface(potato);
        scene.showPlantFarm();
        scene.harvest();
        scene.showPlantFarm();
    }

    @Test
    public void gameTest1(){
//        //加载玩家信息
//        Rancher rancher = new Rancher("wn");
//        //进入牧场
//        AnimalFarmScene scene = (AnimalFarmScene)new SceneBuilder("AnimalFarm", rancher).construct();
//        //查看牧场信息
//        scene.showAnimalFarm();

    }
}
