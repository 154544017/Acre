package Test;

import Creation.AbstractFactory.MaleFactory;
import Creation.Builder.SceneBuilder;
import Creation.FactoryMethod.ChineseCabbageFactory;
import Creation.FactoryMethod.CornFactory;
import Creation.FactoryMethod.PotatoFactory;
import Model.Animal.MaleRabbit;
import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Potato;
import Model.Rancher;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Strategy.ApplyFertilizer;
import Model.Strategy.Context;
import Model.Strategy.Watering;
import Operation.OperationFacade;
import Structure.Composite.GoodsEnum;
import org.junit.Test;

public class GameTest {

    public static String getInfo(String s){
        return String.format("%30s", s).replace(" ","-") + "---------------------------";
    }
    @Test
    public void gameTest(){
        //加载玩家信息
        System.out.println(getInfo("加载农场"));
        Rancher rancher = new Rancher("wn");
        //进入农场
        PlantFarmScene scene = (PlantFarmScene)new SceneBuilder("PlantFarm", rancher).construct();
        //查看农场信息
        System.out.println(getInfo("查看农场信息"));
        scene.showPlantFarm();
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //买种子
        System.out.println(getInfo("购入种子：玉米、土豆、白菜、杂交玉米种子， 如果所需钱不够，会提示购买失败"));
        OperationFacade operationFacade = new OperationFacade(rancher);
        operationFacade.buy(GoodsEnum.CORN_SEED,10);
        operationFacade.buy(GoodsEnum.POTATO_SEED, 10);
        operationFacade.buy(GoodsEnum.CABBAGE_SEED,50);
        operationFacade.buy(GoodsEnum.HYBRIDCORN_SEED,10);
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //种玉米、土豆、大白菜
        System.out.println(getInfo("种植蔬菜：玉米、土豆、白菜、杂交玉米, 如果所需种子数量不够，会提示种植失败"));
        scene.plant(GoodsEnum.CORN_SEED);
        scene.plant(GoodsEnum.POTATO_SEED);
        scene.plant(GoodsEnum.CABBAGE_SEED);
        scene.plant(GoodsEnum.HYBRIDCORN_SEED);
        scene.showPlantFarm();
        //给玉米浇水，土豆施肥（给成熟的浇水）
        System.out.println(getInfo("给0号土地的植物浇水"));
        Context context = new Context(new Watering());
        context.contextInterface(scene.getPlantByLandId(0));
        context.setStrategy(new ApplyFertilizer());
        System.out.println(getInfo("给0，1号土地的植物施肥"));
        context.contextInterface(scene.getPlantByLandId(1));
        context.contextInterface(scene.getPlantByLandId(0));
        //查看现在的种植状况
        System.out.println(getInfo("查看土地种植状况"));
        scene.showPlantFarm();
        //一键收取成熟的作物
        System.out.println(getInfo("一键收取成熟的作物"));
        scene.harvest();
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //出售玉米
        System.out.println(getInfo("出售玉米"));
        operationFacade.sell(GoodsEnum.CORN,1,new String[]{"0"});
    }

    @Test
    public void gameTest1(){
        //加载玩家信息
        System.out.println(getInfo("加载牧场"));
        Rancher rancher = new Rancher("wn");
        //进入牧场
        AnimalFarmScene scene = (AnimalFarmScene)new SceneBuilder("AnimalFarm", rancher).construct();
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //查看牧场信息
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //购买动物幼崽
        System.out.println(getInfo("购入幼崽：兔子、牛、鸡幼崽"));
        OperationFacade operationFacade = new OperationFacade(rancher);
        operationFacade.buy(GoodsEnum.RABBIT_CUB,10);
        operationFacade.buy(GoodsEnum.CATTLE_CUB, 10);
        operationFacade.buy(GoodsEnum.CHICKEN_CUB,5);
        //查看仓库
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //饲养动物
        System.out.println(getInfo("饲养兔子、牛、鸡"));
        scene.raiseAnimal(GoodsEnum.RABBIT_CUB);
        scene.raiseAnimal(GoodsEnum.CATTLE_CUB);
        scene.raiseAnimal(GoodsEnum.CHICKEN_CUB);
        //查看牧场
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //喂养兔子，实现桥接模式
        System.out.println(getInfo("喂养兔子:优质饲料"));
        scene.feedAnimal(0,"ExcellentFodder");
        scene.feedAnimal(0,"ExcellentFodder");
        //喂养鸡，实现桥接模式
        System.out.println(getInfo("喂养鸡:普通饲料"));
        scene.feedAnimal(1,"MediumFodder");
        //查看牧场信息
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //收取副产品
        System.out.println(getInfo("收取副产品"));
        scene.harvestByProduct();
        //一键收取成熟的动物
        System.out.println(getInfo("收取动物"));
        scene.harvestAnimal();
        //查看仓库
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
    }
}
