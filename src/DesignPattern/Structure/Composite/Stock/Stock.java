package DesignPattern.Structure.Composite.Stock;

import Model.Goods.GoodsEnum;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用了组合模式
 * 包里嵌套了包，方便用户在相应子包中检索相关物品
 */
public class Stock {
    private volatile static Stock stock;
    private HashMap<GoodsEnum, Integer> stockMap;
    /**
     * 子背包，实现组合模式
     */
    private List<Object> subStock;

    public List<Object> getSubStock() {
        return subStock;
    }


    /**
     * 构造方法
     * 初始化物品的数量
     */
    public Stock(){
        stockMap = new HashMap<>();
        subStock = new ArrayList<>();
        for(GoodsEnum goodsEnum : GoodsEnum.values()){
            stockMap.put(goodsEnum, 0);
        }
    }

    /**
     * 得到当前背包
     * @return DesignPattern.Structure.Composite.Stock
     */
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

    /**
     * 展示背包中所有的物品以及数量
     */
    public void showStock(){
        MyUtils.getModifierString(this,null,"showStock");
        System.out.println("背包内有如下物品:");
        System.out.format("%-20s%-16s%n","名称","数量");
        for(Map.Entry<GoodsEnum, Integer> entry: stockMap.entrySet()){
            System.out.format("%-20s%-16d%n",entry.getKey().toString(),entry.getValue());
        }
    }

    /**
     * 得到背包下相应物品的数量
     * @param goods
     * @return int
     */
    public int getStock(GoodsEnum goods){
        return stockMap.getOrDefault(goods, -1);
    }

    /**
     * 将相应数量的物品拿出背包
     * @param goods
     * @param num
     * @return boolean
     */
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

    /**
     * 将相应数量的物品放入背包
     * @param goods
     * @param num
     */
    public void stockIn(GoodsEnum goods, int num){
        MyUtils.getModifierString(this,null,"stockIn");
        stockMap.put(goods, stockMap.get(goods) + num);
        System.out.println(goods.toString() + "入库" + num + "," + "当前库存" + stockMap.get(goods));
    }
}
