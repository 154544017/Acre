package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.Iterator.FarmlandManagement.FarmlandIteratorAndProxy;
import DesignPattern.Behavior.Iterator.FarmlandManagement.FarmlandSet;
import DesignPattern.Creation.FactoryMethod.PlantFactory;
import DesignPattern.Creation.FactoryMethod.PotatoFactory;
import Model.Plant.Plant;
import Util.MyUtils;

public class IteratorTest {
    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("迭代器模式测试"));
        System.out.println("检查农场中农地状态：");
        FarmlandSet farmlandSet = new FarmlandSet(3);
        FarmlandIteratorAndProxy ite = farmlandSet.getIterator();
        PlantFactory factory1 = new PotatoFactory();
        Plant corn1 = factory1.createPlant();
        ite.current().plantCrop(corn1);
        ite.current().plantCrop(corn1);
        while(true){
            ite.current().show();
            if(ite.hasNext()) {
                ite.next();
            }else{
                break;
            }
        }
        System.out.println(MyUtils.getInfo("迭代器模式测试成功！"));
    }
}
