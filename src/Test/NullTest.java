package Test;

import DesignPattern.NullLife.NullLife;
import Model.Animal.Animal;
import Model.Animal.Cow;
import Model.FarmLife;
import Util.MyUtils;

public class NullTest {
    public static void main(String []args){
        System.out.println(MyUtils.getInfo("空对象模式测试"));
        System.out.println("定义一个空动物");
        FarmLife life = new NullLife();
        System.out.println("显示动物信息");
        life.show();
        System.out.println("得到动物自身");
        System.out.println(life.getSelf());
        System.out.println("判断动物是否为空对象");
        System.out.println(life.isNull());
        System.out.println("----------------------------");
        System.out.println("作为对比,定义一只奶牛");
        Animal cow =new Cow();
        System.out.println("显示动物信息");
        cow.show();
        System.out.println("得到动物自身");
        System.out.println(cow.getSelf());
        System.out.println("判断动物是否为空对象");
        System.out.println(cow.isNull());
        System.out.println(MyUtils.getInfo("空对象模式结束"));

    }
}
