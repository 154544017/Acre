package Model;

import DesignPattern.Behavior.ChainOfResponsibility.Handler;
import Model.Goods.GoodsEnum;
import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Plant;
import Model.Plant.Potato;
import DesignPattern.Behavior.State.Maturation;
import DesignPattern.Structure.Composite.Stock.Stock;
import Util.MyUtils;

/**
 * 农地类，提供种植作物、收割作物等方法
 */
public class Farmland {
    public static int SOFT = 1;
    public static int MIXED = 2;
    public static int HARD = 3;
    public static int HARDNESSTYPE[] = {SOFT,MIXED,HARD};
    private static int count = 0;
    public Integer landId;
    public Plant crop;
    public boolean isEmpty;
    private int hardness;
    public Farmland(){
        this.isEmpty =true;
        this.landId = count++;
        this.hardness = HARDNESSTYPE[(int)(0+Math.random()*(2-1+1))];
        Handler chainOfHandler = Handler.getChainOfHandler();
        chainOfHandler.selectHandler(hardness,this);
    }

    /**
     * 种植作物
     * @param crop 作物实例
     * @return 是否种植成功
     */
    public boolean plantCrop(Plant crop){
        boolean isSuccess = true;
        if(isEmpty) {
            this.crop = crop;
            this.isEmpty = false;
            System.out.println(landId.toString() + "号农地种下作物:"+crop.getSelf());
        }else{
            System.out.println(landId.toString() + "号农地已有作物");
            isSuccess =false;
        }
        return isSuccess;
    }

    /**
     * 收割作物
     */
    public void reapCrop(){
        MyUtils.getModifierString(this,null,"reapCrop");
        Stock stock = Stock.getInstance();
        if(isEmpty)
            return;
        if(crop.getState().getClass().equals(Maturation.class)){
            System.out.println(landId.toString() + "号农地收获作物:"+crop.getSelf());
            addToStock(stock, crop);
            this.crop = null;
            this.isEmpty = true;
        }else{
            System.out.println(landId.toString() + "号农地作物"+crop.getSelf()+"尚未成熟");
        }
    }

    private void addToStock(Stock stock, Plant crop) {
        if(crop.getClass() == Corn.class){
            stock.stockIn(GoodsEnum.CORN,1);
        }else if(crop.getClass() == ChineseCabbage.class){
            stock.stockIn(GoodsEnum.CABBAGE,1);
        }else if(crop.getClass() == Potato.class){
            stock.stockIn(GoodsEnum.PASTURE,1);
        }else {
            stock.stockIn(GoodsEnum.POTATO,1);
        }
    }

    public void show(){
        if(isEmpty){
            System.out.println(landId.toString() + "号农地为空地");
        }else{
            System.out.println(landId.toString() + "号有农地作物"+crop.getSelf()+",该作物：");
            crop.show();
        }
    }
}
