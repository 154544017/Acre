package Behavior.Command;

import java.util.HashMap;

public class Stock {
    private HashMap<StockGoods, Integer> stock;

    public void stockOut(StockGoods goods, int num){

    }

    public void stockIn(StockGoods goods, int num){

    }


    public int getStock(StockGoods goods){
        return stock.get(goods);
    }
}
