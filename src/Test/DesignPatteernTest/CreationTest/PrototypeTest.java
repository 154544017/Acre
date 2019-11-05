package Test.DesignPatteernTest.CreationTest;

import DesignPattern.Creation.FactoryMethod.ChineseCabbageFactory;
import DesignPattern.Creation.FactoryMethod.CornFactory;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Plant.Plant;
import Util.MyUtils;
import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("原型模式测试"));
        System.out.println(MyUtils.getInfo("工厂生产的Plant/Animal均为Clone产生"));
        List<Plant> list = new ArrayList<>();
        Plant potato = new PotatoFactory().createPlant();
        Plant cabbage = new ChineseCabbageFactory().createPlant();
        Plant corn = new CornFactory().createPlant();
        list.add(potato);
        list.add(cabbage);
        list.add(corn);
        for(Plant plant: list){
            plant.show();
        }
        System.out.println(MyUtils.getInfo("原型模式测试成功"));
    }
}
