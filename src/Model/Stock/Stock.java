package Model.Stock;

import Structure.Composite.GoodsEnum;

import java.util.HashMap;

public class Stock {
    private volatile static Stock stock;
    private HashMap<GoodsEnum, Integer> stockMap;

    private Stock(){
        stockMap = new HashMap<>();
        for(GoodsEnum goodsEnum : GoodsEnum.values()){
            stockMap.put(goodsEnum, 0);
        }
    }

    public static Stock getInstance(){
        if(stock == null){
            synchronized (Stock.class){
                if(stock == null){
                    stock = new Stock();
                }
            }
        }
        return stock;
    }

    public int getStock(GoodsEnum goods){
        return stockMap.getOrDefault(goods, -1);
    }

    public void stockOut(GoodsEnum goods, int num){
        if(stockMap.containsKey(goods)){
            if(stockMap.get(goods) >= num){
                int currentStock = stockMap.get(goods);
                currentStock -= num;
                stockMap.put(goods, currentStock);
                System.out.println(goods.toString() + "出库" + num + "," + "当前库存" + currentStock);
            }else{
                System.out.println("库存不足！");
            }
        }else{
            System.out.println("此物品不存在！");
        }
    }

    public void stockIn(GoodsEnum goods, int num){
        stockMap.put(goods, stockMap.get(goods) + num);
        System.out.println(goods.toString() + "入库" + num + "," + "当前库存" + stockMap.get(goods));
    }
}
