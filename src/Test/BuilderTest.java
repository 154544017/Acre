package Test;

import DesignPattern.Creation.Builder.AnimalFarmSceneBuilder;
import DesignPattern.Creation.Builder.PlantFarmSceneBuilder;
import DesignPattern.Creation.Builder.SceneBuilder;
import Model.Rancher;
import Util.MyUtils;

public class BuilderTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("建造者模式测试"));
        Rancher rancher = new Rancher("player");
        new PlantFarmSceneBuilder("PlantFarm", rancher).construct();
        new AnimalFarmSceneBuilder("AnimalFarm", rancher).construct();
        System.out.println(MyUtils.getInfo("建造者模式测试成功"));
    }
}
