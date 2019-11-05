package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.Command.CommandInvoker;
import DesignPattern.Behavior.Command.StockIn;
import DesignPattern.Behavior.Command.StockOut;
import Model.Goods.GoodsEnum;
import Util.MyUtils;

public class CommandTest {
    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("命令模式测试"));
        StockIn pastureStockIn = new StockIn(GoodsEnum.PASTURE, 10);
        StockIn cornStockIn = new StockIn(GoodsEnum.CORN, 20);
        StockIn eggStockIn = new StockIn(GoodsEnum.EGG, 30);

        StockOut pastureStockOut = new StockOut(GoodsEnum.PASTURE, 6);
        StockOut cornStockOut = new StockOut(GoodsEnum.CORN, 30);
        StockOut eggStockOut = new StockOut(GoodsEnum.EGG, 24);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(pastureStockIn);
        commandInvoker.addCommand(cornStockIn);
        commandInvoker.addCommand(eggStockIn);
        commandInvoker.addCommand(pastureStockOut);
        commandInvoker.addCommand(cornStockOut);
        commandInvoker.addCommand(eggStockOut);
        commandInvoker.execCommand();
        System.out.println(MyUtils.getInfo("命令模式测试成功"));
    }
}
