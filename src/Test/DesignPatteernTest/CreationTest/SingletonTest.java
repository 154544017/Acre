package Test.DesignPatteernTest.CreationTest;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Main.Application;
import Util.MyUtils;

public class SingletonTest {

    public static void main(String []args) {
        System.out.println(MyUtils.getInfo("单例模式测试"));
        System.out.println("获取两个GoodsFactory的实例");
        GoodsFactory goodsFactory = GoodsFactory.getInstance();
        GoodsFactory goodsFactory1 = GoodsFactory.getInstance();
        System.out.println("检查两对象地址是否相等：" + (goodsFactory == goodsFactory1));
        System.out.println("获取两个Application的实例");
        Application application = Application.getInstance();
        Application application1 = Application.getInstance();
        System.out.println("检查两对象地址是否相等：" + (application == application1));

        System.out.println(MyUtils.getInfo("单例模式测试成功"));
    }
}
