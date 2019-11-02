package Model.Stock;

import Creation.FlyweightFactory.GoodsFactory;
import Model.Goods.Product;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

import java.util.HashMap;
import java.util.Map;

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

    public void showStock(){
        MyUtils.getModifierString(this,null,"showStock");
        System.out.println("背包内有如下物品:");
        System.out.format("%-20s%-16s%n","名称","数量");
        for(Map.Entry<GoodsEnum, Integer> entry: stockMap.entrySet()){
            System.out.format("%-20s%-16d%n",entry.getKey().toString(),entry.getValue());
        }
    }

    public int getStock(GoodsEnum goods){
        return stockMap.getOrDefault(goods, -1);
    }

    public boolean stockOut(GoodsEnum goods, int num){
        MyUtils.getModifierString(this,null,"stockOut");
        if(stockMap.containsKey(goods)){
            if(stockMap.get(goods) >= num){
                int currentStock = stockMap.get(goods);
                currentStock -= num;
                stockMap.put(goods, currentStock);
                System.out.println(goods.toString() + "出库" + num + "," + "当前库存" + currentStock);
                return true;
            }else{
                System.out.println("库存不足！");
                return false;
            }
        }else{
            System.out.println("此物品不存在！");
            return false;
        }
    }

    public void stockIn(GoodsEnum goods, int num){
        MyUtils.getModifierString(this,null,"stockIn");
        stockMap.put(goods, stockMap.get(goods) + num);
        System.out.println(goods.toString() + "入库" + num + "," + "当前库存" + stockMap.get(goods));
    }
}
