package Creation.FlyweightFactory;


import Model.Goods.Goods;
import Structure.Composite.GoodsEnum;

import java.util.Hashtable;

public class GoodsFactory {
    private GoodsFactory(){};
    private static GoodsFactory ourInstance = new GoodsFactory();
    public static GoodsFactory getInstance() {
        return ourInstance;
    }
    private static Hashtable<GoodsEnum,Integer> priceTable = new Hashtable<GoodsEnum,Integer>() {
        {
            put(GoodsEnum.CABBAGE,4);
            put(GoodsEnum.CABBAGE_SEED,1);
            put(GoodsEnum.CHICKEN,6);
            put(GoodsEnum.CHICKEN_CUB,2);
            put(GoodsEnum.CATTLE,10);
            put(GoodsEnum.CATTLE_CUB,4);
            put(GoodsEnum.CORN,5);
            put(GoodsEnum.CORN_SEED,2);
            put(GoodsEnum.EGG,2);
            put(GoodsEnum.MILK,2);
            put(GoodsEnum.PASTURE,5);
            put(GoodsEnum.PASTURE_SEED,2);
            put(GoodsEnum.POTATO,5);
            put(GoodsEnum.POTATO_SEED,2);
            put(GoodsEnum.RABBIT,8);
            put(GoodsEnum.RABBIT_CUB,3);
            put(GoodsEnum.RABBIT_HAIR,2);
            put(GoodsEnum.BEEF,55);
        }
    };
    private Hashtable pool = new Hashtable<GoodsEnum, Goods>();
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
