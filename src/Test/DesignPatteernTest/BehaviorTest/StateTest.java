package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.State.Growth;
import DesignPattern.Behavior.State.Maturation;
import DesignPattern.Behavior.State.State;
import DesignPattern.Behavior.State.Youth;
import DesignPattern.Creation.AbstractFactory.AnimalFactory;
import DesignPattern.Creation.AbstractFactory.FemaleFactory;
import DesignPattern.Creation.AbstractFactory.MaleFactory;
import Model.Animal.Animal;
import Model.Animal.Cow;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("状态模式测试"));
        State growth=new Growth();
        growth.getNum();
        growth.react();
        growth.toString();

        State youth=new Youth();
        youth.getNum();
        youth.react();
        youth.toString();

        State maturation=new Maturation();
        maturation.getNum();
        maturation.react();
        maturation.toString();

        System.out.println("------------检查setState------------");
        Animal cow=new Cow();
        cow.setState(growth);
        cow.setState(youth);
        cow.setState(maturation);

        System.out.println(MyUtils.getInfo("状态模式测试成功"));
    }
}
