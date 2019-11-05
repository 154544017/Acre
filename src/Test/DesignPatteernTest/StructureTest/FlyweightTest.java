package Test.DesignPatteernTest.StructureTest;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Goods.GoodsEnum;
import Util.MyUtils;

public class FlyweightTest {
    public static void main(String []args) {
        System.out.println(MyUtils.getInfo("享元模式测试"));
        GoodsFactory goodsFactory = GoodsFactory.getInstance();
        Goods chicken = goodsFactory.getGoods(GoodsEnum.CHICKEN);
        chicken.show();
        Goods chicken2 = goodsFactory.getGoods(GoodsEnum.CHICKEN);
        chicken2.show();
        System.out.println("检查两对象地址是否相等："+(chicken == chicken2));
        System.out.println(MyUtils.getInfo("享元模式测试成功"));
    }
}
