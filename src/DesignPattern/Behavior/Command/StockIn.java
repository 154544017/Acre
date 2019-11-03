package DesignPattern.Behavior.Command;

import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Goods.GoodsEnum;

/**
 * 使用了命令模式
 * 通过货物类型和入库数量构建入库命令
 */
public class StockIn implements Command {
    private Stock stock;
    private GoodsEnum goodsEnum;
    private int stockInNum;

    /**
     * 构造函数
     * @param goodsEnum 货物类型
     * @param stockInNum 入库数量
     */
    public StockIn(GoodsEnum goodsEnum, int stockInNum){
        stock = Stock.getInstance();
        this.goodsEnum = goodsEnum;
        this.stockInNum = stockInNum;
    }

    /**
     * 执行入库命令
     */
    @Override
    public void execute() {
        stock.stockIn(goodsEnum, stockInNum);
    }
}
