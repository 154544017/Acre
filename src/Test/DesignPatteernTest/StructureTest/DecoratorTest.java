package Test.DesignPatteernTest.StructureTest;

import DesignPattern.Structure.Decorator.BoxingDecorator;
import DesignPattern.Structure.Decorator.ProcessDecorator;
import DesignPattern.Structure.Decorator.WholesaleDecorator;
import Model.Goods.Product;
import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.GoodsEnum;
import Util.MyUtils;


public class DecoratorTest {

    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("装饰器模式测试"));
        DecoratorProduct();
        System.out.println(MyUtils.getInfo("装饰器模式测试成功"));
    }

    public static void DecoratorProduct(){
        GoodsFactory goodsFactory = GoodsFactory.getInstance();

        Product beef = goodsFactory.getGoods(GoodsEnum.BEEF);
        Product cabbageVeg = goodsFactory.getGoods(GoodsEnum.CABBAGE);
        Product grassVeg = goodsFactory.getGoods(GoodsEnum.PASTURE);
        Product egg = goodsFactory.getGoods(GoodsEnum.EGG);
        Product rabbitHair = goodsFactory.getGoods(GoodsEnum.RABBIT_HAIR);
        Product rabbitMeat = goodsFactory.getGoods(GoodsEnum.RABBIT);
        Product potatoVeg = goodsFactory.getGoods(GoodsEnum.POTATO);
        Product chickenMeat = goodsFactory.getGoods(GoodsEnum.CHICKEN);
        Product cornVeg = goodsFactory.getGoods(GoodsEnum.CORN);

        System.out.println(beef.toString());
        System.out.println(egg.toString());
        System.out.println(rabbitHair.toString());
        System.out.println(rabbitMeat.toString());
        System.out.println(chickenMeat.toString());
        System.out.println(potatoVeg.toString());
        System.out.println(grassVeg.toString());
        System.out.println(cabbageVeg.toString());
        System.out.println(cornVeg.toString());



        ProcessDecorator beefBoxing = new BoxingDecorator(beef);
        ProcessDecorator grassBoxing = new BoxingDecorator(grassVeg);
        ProcessDecorator gabbageBoxing = new BoxingDecorator(cabbageVeg);
        ProcessDecorator eggBoxing = new BoxingDecorator(egg);
        ProcessDecorator rabbitHairBoxing = new BoxingDecorator(rabbitHair);
        ProcessDecorator rabbitMeatBoxing = new BoxingDecorator(rabbitMeat);
        ProcessDecorator potatoBoxing = new BoxingDecorator(potatoVeg);
        ProcessDecorator chickenBoxing = new BoxingDecorator(chickenMeat);
        ProcessDecorator cornBoxing = new BoxingDecorator(cornVeg);

        System.out.println(beefBoxing.toString());
        System.out.println(grassBoxing.toString());
        System.out.println(gabbageBoxing.toString());
        System.out.println(eggBoxing.toString());
        System.out.println(rabbitHairBoxing.toString());
        System.out.println(rabbitMeatBoxing.toString());
        System.out.println(potatoBoxing.toString());
        System.out.println(chickenBoxing.toString());
        System.out.println(cornBoxing.toString());

        ProcessDecorator beefBoxingWholesale = new WholesaleDecorator(beefBoxing);
        ProcessDecorator grassBoxingWholesale = new WholesaleDecorator(grassBoxing);
        ProcessDecorator gabbageBoxingWholesale = new WholesaleDecorator(gabbageBoxing);
        ProcessDecorator eggBoxingWholesale = new WholesaleDecorator(eggBoxing);
        ProcessDecorator rabbitHairBoxingWholesale = new WholesaleDecorator(rabbitHairBoxing);
        ProcessDecorator rabbitMeatBoxingWholesale = new WholesaleDecorator(rabbitMeatBoxing);
        ProcessDecorator potatoBoxingWholesale = new WholesaleDecorator(potatoBoxing);
        ProcessDecorator chickenBoxingWholesale = new WholesaleDecorator(chickenBoxing);
        ProcessDecorator cornBoxingWholesale = new WholesaleDecorator(cornBoxing);

        System.out.println(beefBoxingWholesale.toString());
        System.out.println(grassBoxingWholesale.toString());
        System.out.println(gabbageBoxingWholesale.toString());
        System.out.println(eggBoxingWholesale.toString());
        System.out.println(rabbitHairBoxingWholesale.toString());
        System.out.println(rabbitMeatBoxingWholesale.toString());
        System.out.println(potatoBoxingWholesale.toString());
        System.out.println(chickenBoxingWholesale.toString());
        System.out.println(cornBoxingWholesale.toString());

    }



}
