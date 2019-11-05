package Test.DesignPatteernTest.StructureTest;

import DesignPattern.Structure.Facade.Operation.OperationFacade;
import Model.Goods.GoodsEnum;
import Model.Rancher;
import Util.MyUtils;


public class FacadeTest {

    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("外观模式测试"));
        facadeTest();
        System.out.println(MyUtils.getInfo("外观模式测试成功"));
    }

    public static void facadeTest(){
        Rancher rancher = new Rancher("ppp");
        OperationFacade operationFacade = new OperationFacade(rancher);
        operationFacade.buy(GoodsEnum.CABBAGE_SEED,10);
        operationFacade.sell(GoodsEnum.CABBAGE_SEED,1,null);
        operationFacade.sell(GoodsEnum.CABBAGE_SEED,2, new String[]{"0"});
        operationFacade.sell(GoodsEnum.CABBAGE_SEED,2,new String[]{"1"});
        operationFacade.sell(GoodsEnum.CABBAGE_SEED,5,new String[]{"1","0","-1"});
        operationFacade.sell(GoodsEnum.CABBAGE_SEED,1,null);
    }



}
