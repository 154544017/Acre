package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.Visitor.OptimizationVisitor;
import DesignPattern.Creation.Builder.PlantFarmSceneBuilder;
import DesignPattern.Creation.FactoryMethod.ChineseCabbageFactory;
import DesignPattern.Creation.FactoryMethod.CornFactory;
import DesignPattern.Creation.FactoryMethod.PastureFactory;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Pasture;
import Model.Plant.Potato;
import Model.Rancher;
import Model.Scene.PlantFarmScene;

import Model.Goods.GoodsEnum;
import Util.MyUtils;

public class VisitorTest {
    public static void main(String[] args) {
        //加载玩家信息
        System.out.println(MyUtils.getInfo("访问者模式测试"));
        //创建访问者，为了简化测试，创建了OptimizationVisitor
        OptimizationVisitor visitor = new OptimizationVisitor();
        //玉米->Visitor
        Corn corn = (Corn) new CornFactory().createPlant();
        corn.accept(visitor);
        //白菜->Visitor
        ChineseCabbage cabbage =(ChineseCabbage) new ChineseCabbageFactory().createPlant();
        cabbage.accept(visitor);
        //牧草->Visitor
        Pasture pasture =(Pasture) new PastureFactory().createPlant();
        pasture.accept(visitor);
        //土豆->Visitor
        Potato potato = (Potato) new PotatoFactory().createPlant();
        potato.accept(visitor);
        System.out.println(MyUtils.getInfo("访问者模式测试成功"));
    }

}