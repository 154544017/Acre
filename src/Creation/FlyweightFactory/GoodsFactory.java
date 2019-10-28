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
    private static Hashtable<GoodsEnum,Integer> priceTable = new Hashtable<>() {
        {
            put(GoodsEnum.CABBAGE,4);
            put(GoodsEnum.CABBAGE_SEED,1);
            put(GoodsEnum.CHICKEN,6);
            put(GoodsEnum.CHICKEN_CUB,2);
            //未完待续

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
