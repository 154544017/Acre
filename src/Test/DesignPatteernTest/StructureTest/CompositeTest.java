package Test.DesignPatteernTest.StructureTest;

import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Plant.Corn;
import Model.Plant.Potato;
import Util.MyUtils;

public class CompositeTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("组合模式测试"));
        Stock stock=new Stock();
        Stock stock1=new Stock();
        Corn corn=new Corn();
        stock.getSubStock().add(stock1);
        stock1.getSubStock().add(corn);
        System.out.println("stock里存放了stock1,stock1里存放了corn");
        System.out.println(MyUtils.getInfo("组合模式测试成功"));


        Stock stock3=new Stock();
        Stock stock4=new Stock();
        Potato potato=new Potato();
        stock3.getSubStock().add(stock4);
        stock4.getSubStock().add(potato);
    }
}
