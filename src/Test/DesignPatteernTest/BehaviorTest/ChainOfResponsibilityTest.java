package Test.DesignPatteernTest.BehaviorTest;

import Model.Farmland;
import Util.MyUtils;

public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("责任链模式测试"));
        for(int i = 0; i < 5; i++){
            Farmland farmland= new Farmland();
        }
        System.out.println(MyUtils.getInfo("责任链模式测试成功"));
    }
}
