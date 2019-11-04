package DesignPattern.Structure.Facade.Operation;

import Model.Rancher;
import Model.Goods.GoodsEnum;

/**
 *  使用了外观模式
 *  该类作为一个界面暴露给外部去调用，其内容则是关于购买和出售操作的系统。
 */
public class OperationFacade {
    private SaleOperation buySaleOperation;
    private SaleOperation sellSaleOperation;
    private Rancher rancher;

    /**
     *
     * @param rancher Rnacher类
     */
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
     * @param goodsEnum GoodsEnum枚举类，代表需要操作的对象
     * @param number int类型，代表数量
     * @param method String[]，可变参数，在某些接口有用，在某些接口被掩蔽。在该类中，该变量被使用。
     *             ["0"] 代表对原产品进行包装(价格会变动)
     *             ["1"] 代表将原产品以批发价出售
     *             ["0","1"],["1","0"],["1","0","-1","2"] 均代表将原产品先包装再以批发价出售。
     *                      仅"0","1"具有实际意义。"-1","2"等会被忽略。
     *             null 或者 [] 会被视为不进行任何处理。
     */
    public void sell(GoodsEnum goodsEnum,int number,String[] method){
        sellSaleOperation.peopleOperation(this.rancher,goodsEnum,number,method);
    }



}
