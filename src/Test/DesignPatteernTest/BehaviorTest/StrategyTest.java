package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.Strategy.Strategy;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Plant.Plant;
import DesignPattern.Behavior.Strategy.ApplyFertilizer;
import DesignPattern.Behavior.Strategy.Context;
import DesignPattern.Behavior.Strategy.Watering;
import Util.MyUtils;


public class StrategyTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("策略模式测试"));
        PotatoFactory potatoFactory = new PotatoFactory();
        Plant potato0 =  potatoFactory.createPlant();

        Context context = new Context(new Watering());
        context.contextInterface(potato0);
        System.out.println(MyUtils.getInfo("更换策略"));
        Strategy strategy = new ApplyFertilizer();
        context.setStrategy(strategy);
        context.contextInterface(potato0);
        System.out.println(MyUtils.getInfo("策略模式测试成功"));
    }

}
