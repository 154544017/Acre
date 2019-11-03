package Behavior.Command;

import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

/**
 * 使用了命令模式
 * 通过货物类型和出库数量构建出库命令
 */
public class StockOut implements Command {
    private Stock stock;
    private GoodsEnum goodsEnum;
    private int stockOutNum;

    /**
     * 构造函数
     * @param goodsEnum 货物类型
     * @param stockOutNum 出库数量
     */
    public StockOut(GoodsEnum goodsEnum, int stockOutNum){
        stock = Stock.getInstance();
        this.goodsEnum = goodsEnum;
        this.stockOutNum = stockOutNum;
    }

    /**
     * 执行出库命令
     */
    @Override
    public void execute() {
        stock.stockOut(goodsEnum, stockOutNum);
    }
}
