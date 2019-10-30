package Behavior.Command;

import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

public class StockIn implements Command {
    private Stock stock;
    private GoodsEnum goodsEnum;
    private int stockInNum;

    public StockIn(GoodsEnum goodsEnum, int stockInNum){
        stock = Stock.getInstance();
        this.goodsEnum = goodsEnum;
        this.stockInNum = stockInNum;
    }

    @Override
    public void execute() {
        stock.stockIn(goodsEnum, stockInNum);
    }
}
