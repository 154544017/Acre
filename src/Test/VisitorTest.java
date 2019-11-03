package Test;

import Creation.Builder.PlantFarmSceneBuilder;
import Creation.Builder.SceneBuilder;
import Creation.FactoryMethod.ChineseCabbageFactory;
import Creation.FactoryMethod.CornFactory;
import Creation.FactoryMethod.PastureFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Pasture;
import Model.Plant.Potato;
import Model.Rancher;
import Model.Scene.PlantFarmScene;

import Structure.Composite.GoodsEnum;
import org.junit.Test;

public class VisitorTest {
    @Test
    public void visitorTest(){
        //加载玩家信息
        Rancher rancher = new Rancher("fp");
        //建立种植物的地方
        PlantFarmScene scene = (PlantFarmScene)new PlantFarmSceneBuilder("PlantFarm", rancher).construct();
        //玉米->farmland
        Corn corn = (Corn) new CornFactory().createPlant();
        corn.buryIn(scene);
        scene.accept(corn);
        //白菜->farmland
        ChineseCabbage cabbage =(ChineseCabbage) new ChineseCabbageFactory().createPlant();
        cabbage.buryIn(scene);
        scene.accept(cabbage);
        //pasture->farmland
        Pasture pasture =(Pasture) new PastureFactory().createPlant();
        pasture.buryIn(scene);
        scene.accept(pasture);
        //土豆->farmland
        Potato potato = (Potato) new PotatoFactory().createPlant();
        potato.buryIn(scene);
        scene.accept(potato);
        //用访问者模式种这些,发现库存不足
        scene.plant(GoodsEnum.PASTURE_SEED);

    }

}
