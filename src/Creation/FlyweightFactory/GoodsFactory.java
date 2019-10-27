package Creation.FlyweightFactory;


import Model.Goods.Goods;

import java.util.Hashtable;

public abstract class GoodsFactory {
    private Hashtable pool = new Hashtable<String, Goods>();
    public Goods getGoods(String quality) {
        Goods goods =(Goods)pool.get(quality);
        if(goods == null) {
            goods = createGoods(quality);
            pool.put(quality, goods);
        }
        return goods;
    }
    abstract Goods createGoods(String quality);

}
