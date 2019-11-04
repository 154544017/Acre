package DesignPattern.Structure.FlyweightFactory;


import Model.Goods.Goods;
import Model.Goods.GoodsEnum;

import java.util.Hashtable;

/**
 * 使用了享元模式，单例模式
 * 管理货物Goods的创建
 */
public class GoodsFactory {
    private GoodsFactory(){};
    private static GoodsFactory ourInstance = new GoodsFactory();

    /**
     * 返回改工厂的唯一单例
     * @return 该工厂的唯一实例
     */
    public static GoodsFactory getInstance() {
        return ourInstance;
    }

    private static Hashtable<GoodsEnum,Double> priceTable = new Hashtable<GoodsEnum,Double>() {

        {
            put(GoodsEnum.CABBAGE,0.45);
            put(GoodsEnum.CABBAGE_SEED,0.04);
            put(GoodsEnum.HYBRIDCORN_SEED,0.05);
            put(GoodsEnum.HYBRIDCORN,0.9);
            put(GoodsEnum.CHICKEN,100.0);
            put(GoodsEnum.CHICKEN_CUB,25.0);
            put(GoodsEnum.CATTLE,2000.0);
            put(GoodsEnum.CATTLE_CUB,200.0);
            put(GoodsEnum.CORN,0.8);
            put(GoodsEnum.CORN_SEED,0.1);
            put(GoodsEnum.EGG,0.8);
            put(GoodsEnum.MILK,4.5);
            put(GoodsEnum.PASTURE,0.7);
            put(GoodsEnum.PASTURE_SEED,0.03);
            put(GoodsEnum.POTATO,1.2);
            put(GoodsEnum.POTATO_SEED,0.05);
            put(GoodsEnum.RABBIT,78.0);
            put(GoodsEnum.RABBIT_CUB,14.0);
            put(GoodsEnum.RABBIT_HAIR,25.5);
            put(GoodsEnum.BEEF,55.0);
        }
    };
    private Hashtable pool = new Hashtable<GoodsEnum, Goods>();

    /**
     * 获取货物，如果货物已被创建则共享创建过的货物
     * @param goodsEnum 表示货物类型的枚举变量
     * @return 指定货物对象
     */
    public Goods getGoods(GoodsEnum goodsEnum) {
        Goods goods =(Goods)pool.get(goodsEnum);
        if(goods == null) {
            goods = new Goods(goodsEnum);
            if(priceTable.get(goodsEnum) != null) {
                goods.setPrice(priceTable.get(goodsEnum));
            }
            pool.put(goodsEnum, goods);
        }
        return goods;
    }



}
