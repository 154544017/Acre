package Behavior.Command;

import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

public class StockOut implements Command {
    private Stock stock;
    private GoodsEnum goodsEnum;
    private int stockOutNum;

    public StockOut(GoodsEnum goodsEnum, int stockOutNum){
        stock = Stock.getInstance();
        this.goodsEnum = goodsEnum;
        this.stockOutNum = stockOutNum;
    }

    @Override
    public void execute() {
        stock.stockOut(goodsEnum, stockOutNum);
    }
}
