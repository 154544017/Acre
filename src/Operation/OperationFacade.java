package Operation;

import Model.Rancher;
import Structure.Composite.GoodsEnum;

public class OperationFacade {
    private SaleOperation buySaleOperation;
    private SaleOperation sellSaleOperation;
    private Rancher rancher;

    public OperationFacade(Rancher rancher){
        this.rancher = rancher;
        buySaleOperation = new BuySaleOperation();
        sellSaleOperation = new SellSaleOperation();
    }

    /**
     *
     * @param goodsEnum 需要购买的货物,通过GoodsEnum枚举类指定
     * @param number 需要购买的数量
     */
    public void buy(GoodsEnum goodsEnum,int number){
        buySaleOperation.peopleOperation(this.rancher,goodsEnum,number,null);
    }

    /**
     *
     * @param goodsEnum 需要购买的货物,通过GoodsEnum枚举类指定
     * @param number 需要购买的数量
     * @param method 需要进行营销的策略
     *              "0" 代表包装
     *               "1" 代表批发
     *               输入Null 或 空数组 或 其他字符串则不进行处理
     */
    public void sell(GoodsEnum goodsEnum,int number,String[] method){
        sellSaleOperation.peopleOperation(this.rancher,goodsEnum,number,method);
    }



}
